package in.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		out.println("<h1> This is First Servlet</h1>");
		
		
		RequestDispatcher rDispatcher=request.getRequestDispatcher("/test2");
		rDispatcher.include(request, response);
		
		
		out.println("<h1>Welcome Back the First Servlet</h1>");
		out.close();
	}

}
