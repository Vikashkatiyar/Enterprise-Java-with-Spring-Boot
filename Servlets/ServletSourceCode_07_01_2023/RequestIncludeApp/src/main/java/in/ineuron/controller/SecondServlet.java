package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<h1>This is Second Servlet...</h1>");
		System.out.println("Request object adress is :: "+request.hashCode());
		System.out.println("Response object adress is :: "+response.hashCode());
		System.out.println("PrintWriter object address is :: "+out.hashCode());
		
		out.close();

	}

}
