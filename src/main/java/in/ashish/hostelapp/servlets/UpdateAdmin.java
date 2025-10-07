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
import jakarta.servlet.http.HttpSession;
@WebServlet("/updateAdmin")
public class UpdateAdmin extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession(false);
		if(session != null) {
			AdminDAO dao = new  AdminDAOImpl();
			Admin a = (Admin) session.getAttribute("adminLogin");
			
			a.setUsername(req.getParameter("name"));
			a.setEmail(req.getParameter("mail"));
			a.setPhone(Long.parseLong(req.getParameter("phone")));
			
			boolean res = dao.update(a);
			
			if(res) {
				req.setAttribute("success", "Update successfull");
				RequestDispatcher rd = req.getRequestDispatcher("adminProfile.jsp");
				rd.forward(req, resp);
				
			}
			else {
				req.setAttribute("error", "Update failed..!");
				RequestDispatcher rd = req.getRequestDispatcher("updateAdmin.jsp");
				rd.forward(req, resp);
			}
			
		}
		else {
			req.setAttribute("error", "Session Expired!");
			RequestDispatcher rd = req.getRequestDispatcher("adminLogin.jsp");
			rd.forward(req, resp);
		}
	}
}
