package in.ashish.hostelapp.servlets;

import java.io.IOException;

import in.ashish.hostelapp.dao.ResidentDAO;
import in.ashish.hostelapp.dao.ResidentDAOImpl;
import in.ashish.hostelapp.dtao.Resident;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class Signup extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Resident r = new Resident();
		ResidentDAO rdao = new ResidentDAOImpl();
		
		r.setName(req.getParameter("name"));
		r.setEmail(req.getParameter("mail"));
		r.setPhone(Long.parseLong(req.getParameter("phone")));
		r.setGender(req.getParameter("gender"));
		r.setDob(req.getParameter("dob"));
		r.setAddress(req.getParameter("address"));
		
		if(req.getParameter("password").equals(req.getParameter("confirm"))) {
			r.setPassword(req.getParameter("password"));
			boolean res = rdao.insert(r);
			
			if(res) {
				req.setAttribute("success", "SignUp Successfull");
				RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
				rd.forward(req, resp);
			}
			else {
				req.setAttribute("error", "Failed to signup...!");
				RequestDispatcher rd = req.getRequestDispatcher("signup.jsp");
				rd.forward(req, resp);
			}
		}
		else {
			req.setAttribute("error", "Password Mismatch...!");
			RequestDispatcher rd = req.getRequestDispatcher("signup.jsp");
			rd.forward(req, resp);
		}
		
	}

}
