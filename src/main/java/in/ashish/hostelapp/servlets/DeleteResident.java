package in.ashish.hostelapp.servlets;

import java.io.IOException;


import in.ashish.hostelapp.dao.ResidentDAO;
import in.ashish.hostelapp.dao.ResidentDAOImpl;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/deleteResident")
public class DeleteResident extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession(false);
		if(session != null) {
			ResidentDAO dao = new ResidentDAOImpl();
			
			int residentId = Integer.parseInt(req.getParameter("id"));
			
			boolean res = dao.delete(residentId);
			
			if(res) {
				req.setAttribute("success", "Delete successfull");
				RequestDispatcher rd = req.getRequestDispatcher("residentDetails.jsp");
				rd.forward(req, resp);
				
			}
			else {
				req.setAttribute("error", "Delete failed..!");
				RequestDispatcher rd = req.getRequestDispatcher("residentDetails.jsp");
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
