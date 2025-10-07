package in.ashish.hostelapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import in.ashish.hostelapp.dao.AdminDAO;
import in.ashish.hostelapp.dao.AdminDAOImpl;
import in.ashish.hostelapp.dtao.Admin;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/adminLogin")
public class AdminLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Admin a = null;
		AdminDAO adao = new  AdminDAOImpl();
		PrintWriter out = resp.getWriter();
		
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		
		a = adao.getAdmin(email, pass);
		if(a != null) {
//			out.println("<h1> Login Successfull,  Welcome "+a.getUsername()+"</h1>");
			
			HttpSession session = req.getSession(true);
			session.setAttribute("adminLogin", a);
			
			req.setAttribute("success", "Login Successful");
			RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
			rd.forward(req, resp);
		}
		else {
			req.setAttribute("error", "Invalid login credentials..!");
			RequestDispatcher rd = req.getRequestDispatcher("adminLogin.jsp");
			rd.forward(req, resp);
		}
	}
}
