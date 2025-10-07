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
import jakarta.servlet.http.HttpSession;
@WebServlet("/updateResident")
public class UpdateResident extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session != null) {
			ResidentDAO dao = new  ResidentDAOImpl();
			Resident r = (Resident)session.getAttribute("loginSuccess");
			
			r.setName(req.getParameter("name"));
			r.setEmail(req.getParameter("mail"));
			r.setPhone(Long.parseLong(req.getParameter("phone")));
			r.setGender(req.getParameter("gender"));
			r.setDob(req.getParameter("dob"));
			r.setAddress(req.getParameter("address"));
			
			boolean res = dao.update(r);
			
			if(res) {
				req.setAttribute("success", "Update successfull");
				RequestDispatcher rd = req.getRequestDispatcher("residentProfile.jsp");
				rd.forward(req, resp);
				
			}
			else {
				req.setAttribute("error", "Update failed..!");
				RequestDispatcher rd = req.getRequestDispatcher("updateResident.jsp");
				rd.forward(req, resp);
			}
			
		}
		else {
			req.setAttribute("error", "Session Expired!");
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.forward(req, resp);
		}
	}
}
