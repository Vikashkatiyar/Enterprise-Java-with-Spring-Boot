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
 * Servlet implementation class BrowserResponserApp
 */
@WebServlet(urlPatterns = { "/test" }, loadOnStartup = 0)
public class BrowserResponserApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static {
		System.out.println("TestServlet Loading....");
	}

	public BrowserResponserApp() {
		System.out.println("TestServlet Instantiation...");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("TestServlet Initialization....");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("RequestProcessing for GET Request type....");

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Output</title></head>");
		out.println("<body>");
		out.println("<h1 align='center'>Request Header information....</h1>");

		Enumeration<String> headerNames = request.getHeaderNames();
		out.println("<table border='1' align='center'>");
		out.println("<tr><th>HeaderName</th><th>HeaderValue</th></tr>");

		while (headerNames.hasMoreElements()) {
			out.println("<tr>");
			String headerName = (String) headerNames.nextElement();
			String headerValue = request.getHeader(headerName);
			out.println("<td>" + headerName + "</td><td>" + headerValue + "</td>");
			out.println("</tr>");
		}

		out.println("</table>");

		out.println("</body>");
		out.println("</html>");
		out.close();

	}

	@Override
	public void destroy() {
		System.out.println("Servlet DeInstantiation....");
	}

}
