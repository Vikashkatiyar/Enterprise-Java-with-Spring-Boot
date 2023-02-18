package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demo1")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		RequestDispatcher rd = request.getRequestDispatcher("/demo2");
		rd.forward(request, response);

		System.out.println("After forward control comming back");

		out.println("<h1>This output is from FirstServlet Again...</h1>");
		System.out.println(10/0);

	}
	

}
