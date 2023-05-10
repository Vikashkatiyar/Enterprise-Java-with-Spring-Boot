package in.controller;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/test3")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		//Collect request Parameter data
		String email=request.getParameter("mail");
		String mobile=request.getParameter("mobile");
		
		
		
		// Create a session object and store these request parameters
		//data in session
		HttpSession session=request.getSession();
		session.setAttribute("email",email );
		session.setAttribute("mobile", mobile);
		
		
		
		 //retrieve the data from session object
		Object name=session.getAttribute("name");
		Object age=session.getAttribute("age");
		Object qual=session.getAttribute("qual");
		Object design=session.getAttribute("design");
		Object gmail=session.getAttribute("email");
		Object umobile=session.getAttribute("mobile");
		
		
		
		
		//Create a html page take from session object and then send the response
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<center>");
		out.println("<table border='1' bgcolor='cyan'>");
		out.println("<tr><td>Name</td><td>"+name+"</td></tr>");
		out.println("<tr><td>Age</td><td>"+age+"</td></tr>");
		out.println("<tr><td>Qual</td><td>"+qual+"</td></tr>");
		out.println("<tr><td>Design</td><td>"+design+"</td></tr>");
		out.println("<tr><td>Email</td><td>"+gmail+"</td></tr>");
		out.println("<tr><td>Mobile</td><td>"+umobile+"</td></tr>");
		out.println("</table>");
		out.println("</center>");
		
		
		out.close();
		
		
	
	}
	

}
