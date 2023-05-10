package in.page.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTML;

/**
 * Servlet implementation class Registraion
 */
@WebServlet("/register")
public class Registraion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String uname=request.getParameter("uname");
		Integer uage=Integer.parseInt(request.getParameter("uage"));
		
		String umobile=request.getParameter("umobile");
		String email=request.getParameter("email");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		if(uage<19 || uage>40) {
			//sending error
			response.sendError(504, "User Age is not sufficient for Registration");
			
		}else {
			
			//Student is eligible for Registration
			out.println("<html><head><title>Output of the form</title></head>");
			out.println("<body>");
			out.println("<font color='red' align='center'>");
			out.println("<h2>iNeuron Registration Details</h2>");
			out.println("<h2>User Details</h2>");
			out.println("</font>");
			out.println("<table border='1' align='center'>");
			out.println("<tr><td>UserName: </td><td>"+uname+"</td></tr>");
			out.println("<tr><td>Uage: </td><td>"+uage+"</td></tr>");
			out.println("<tr><td>Umobile Number: </td><td>"+umobile+"</td></tr>");
			out.println("<tr><td>Email : </td><td>"+email+"</td></tr>");
			out.println("<tr><td>Registration Status : </td><td>"+"REGISTRATION SUCCESSFULL"+"</td></tr>");
			out.println("</table>");
			out.println("</body>");
			out.println("</head>");
			
			
			

			
			
		}
		
		out.close();
		
		
		
		
	}

}
