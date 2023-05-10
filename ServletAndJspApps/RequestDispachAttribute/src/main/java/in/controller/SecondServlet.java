package in.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		out.println("<h1>Forward request attributes</h1>");
		
		 Enumeration<String> attEnumeration=request.getAttributeNames();
		 out.println("<table border='1'>");
		 out.println("<tr><th>Name</th><th>Value</th></tr>");
		 
		 while(attEnumeration.hasMoreElements()) {
			 out.println("<tr>");
			 String nameString=(String)attEnumeration.nextElement();
			 Object valueObject=request.getAttribute(nameString);
			 
			 out.println("<th>"+nameString+"</th>");
			 out.println("<td>"+valueObject+"</td>");
			 
			 out.println("<tr>");
		 }
		
		out.close();
	}

}
