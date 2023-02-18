package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uname = request.getParameter("uname");
		Integer uage = Integer.parseInt(request.getParameter("uage"));
		String email = request.getParameter("email");
		String umobile = request.getParameter("umobile");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// userage if less than 18 or greater than 30 not eligible for recruitement
		if (uage < 19 || uage > 30) {
			response.sendError(504, "User Age is not sufficent for this Recruitement");
		} else {
			// otherwise, student is eligible for recruitment
			out.println("<html><head><title>Output</title></head>");
			out.println("<body>");
			out.println("<font color = 'red'>");
			out.println("<h2>iNeuron Consultancy Services</h2>");
			out.println("<h2>User registration Details</h2>");
			out.println("</font>");
			out.println("<table border ='1'>");
			out.println("<tr><td>User Name </td><td>" + uname + "</td></tr>");
			out.println("<tr><td>User Age </td><td>" + uage + "</td></tr>");
			out.println("<tr><td>Email</td><td>" + email + "</td></tr>");
			out.println("<tr><td>Mobile Number</td><td>" + umobile + "</td></tr>");
			out.println("<tr><td>Registration status </td><td>REGISTERD SUCCESSFULLY</td></tr>");
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");

		}
		out.close();

	}

}
