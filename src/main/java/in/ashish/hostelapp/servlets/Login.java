package in.ashish.hostelapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Authenticator.RequestorType;

import in.ashish.hostelapp.dao.ResidentDAO;
import in.ashish.hostelapp.dao.ResidentDAOImpl;
import in.ashish.hostelapp.dtao.Resident;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/login")
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ResidentDAO rdao = new ResidentDAOImpl();
		Resident r = null;
		String email = req.getParameter("mail");
		String pass = req.getParameter("password");
		PrintWriter out =  resp.getWriter();
		r = rdao.getResident(email, pass);
		
		if(r != null) {
//			out.println("<h1>Login Successfull,  Welcome "+r.getName()+"</h1>");
			
			  HttpSession session = req.getSession(true);
			  session.setAttribute("loginSuccess", r);
			  
			  req.setAttribute("success", "Login successfull"); 
			  RequestDispatcher rd = req.getRequestDispatcher("home.jsp"); 
			  rd.forward(req, resp);
			 
		}
		else {
			req.setAttribute("error", "Invalid login credentials...!");
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.forward(req, resp);
		}
		
	}
}
