package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/test2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		out.println("<h1>Forward request attributes</h1>");

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
