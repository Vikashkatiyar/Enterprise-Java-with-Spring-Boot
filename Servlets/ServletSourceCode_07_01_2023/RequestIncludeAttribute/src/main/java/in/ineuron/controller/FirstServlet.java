package in.ineuron.controller;

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

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		System.out.println("Request object adress is :: "+request.hashCode());
		System.out.println("Response object adress is :: "+response.hashCode());
		System.out.println("PrintWriter object address is :: "+out.hashCode());
		
		
		request.setAttribute("sachin", "cricketer");
		request.setAttribute("NavinReddy", "Java");
		request.setAttribute("Messi", "Football");

		
		RequestDispatcher rd = request.getRequestDispatcher("/test2");
		rd.include(request, response);
	}

}
