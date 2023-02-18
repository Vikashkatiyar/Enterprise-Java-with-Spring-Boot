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

		// default response type is "text/html" only
		// since it is text/html automaticall the reposne object will hold
		// <html><body></body></html>

		PrintWriter out = response.getWriter();
		out.println("<h1 style='color:red; text-align:center;'>This is first Servlet</h1>");

		RequestDispatcher rd = request.getRequestDispatcher("/test2");
		rd.forward(request, response);

	}

}
