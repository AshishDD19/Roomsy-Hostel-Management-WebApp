package in.ashish.hostelapp.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/logoutAdmin")
public class LogoutAdmin extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession(false);
		if(session != null) {
			session.invalidate();
			req.setAttribute("success", "Logout Successfull");
			RequestDispatcher rd = req.getRequestDispatcher("adminLogin.jsp");
			rd.forward(req, resp);
			
			
		}else {
			req.setAttribute("error", "Session Expired!");
			RequestDispatcher rd = req.getRequestDispatcher("adminLogin.jsp");
			rd.forward(req, resp);
		}
	}
}
