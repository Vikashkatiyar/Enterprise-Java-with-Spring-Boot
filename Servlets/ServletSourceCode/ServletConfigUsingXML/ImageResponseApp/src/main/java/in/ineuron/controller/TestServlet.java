package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/test")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static {
		System.out.println("Servlet Loading...");
	}

	public TestServlet() {
		System.out.println("Servlet Instantiation...");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Servlet Initialization....");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("hello");
		out.close();

		ServletOutputStream os = response.getOutputStream();
		os.write(97);
		os.close();

	}

}
