package in.ineuron.controller;

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
		PrintWriter out = response.getWriter();
		System.out.println("Request object adress is :: "+request.hashCode());
		System.out.println("Response object adress is :: "+response.hashCode());
		System.out.println("PrintWriter object address is :: "+out.hashCode());
		
		
		out.println("<h1>Include request attributes</h1>");

		Enumeration<String> attributeNames = request.getAttributeNames();
		out.println("<table border='1'>");
		out.println("<tr><th>Name</th><th>value</th></tr>");

		while (attributeNames.hasMoreElements()) {
			out.println("<tr>");
			String name = (String) attributeNames.nextElement();
			Object value = request.getAttribute(name);
			out.println("<th>" + name + "</th>");
			out.println("<td>" + value + "</td>");
			out.println("</tr>");
		}
		out.close();
	}

}
