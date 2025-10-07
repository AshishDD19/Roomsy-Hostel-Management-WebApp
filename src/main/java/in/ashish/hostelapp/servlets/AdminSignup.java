package in.ashish.hostelapp.servlets;

import java.io.IOException;

import in.ashish.hostelapp.dao.AdminDAO;
import in.ashish.hostelapp.dao.AdminDAOImpl;
import in.ashish.hostelapp.dtao.Admin;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/adminSignup")
public class AdminSignup extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Admin a = new Admin();
		AdminDAO adao = new AdminDAOImpl();
		
		a.setUsername(req.getParameter("name"));
		a.setEmail(req.getParameter("mail"));
		a.setPhone(Long.parseLong(req.getParameter("phone")));
		
		if(req.getParameter("password").equals(req.getParameter("confirm"))) {
			a.setPassword(req.getParameter("password"));
			boolean res = adao.insert(a);
			
			if(res) {
				req.setAttribute("success", "SignUp Successfull");
				RequestDispatcher rd = req.getRequestDispatcher("adminLogin.jsp");
				rd.forward(req, resp);
			}
			else {
				req.setAttribute("error", "Failed to signup...!");
				RequestDispatcher rd = req.getRequestDispatcher("adminSignup.jsp");
				rd.forward(req, resp);
			}
		}
		else {
			req.setAttribute("error", "Password Mismatch...!");
			RequestDispatcher rd = req.getRequestDispatcher("adminSignup.jsp");
			rd.forward(req, resp);
		}
	}
}
