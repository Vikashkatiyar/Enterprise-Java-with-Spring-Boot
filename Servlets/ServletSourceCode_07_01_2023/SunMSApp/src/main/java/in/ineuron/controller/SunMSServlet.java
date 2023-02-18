package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sunms")
public class SunMSServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		/*
		 * PrintWriter out = response.getWriter();
		 * 
		 * out.println("<html><head><title>Response</title></head>");
		 * out.println("<body>");
		 * out.println("<h1>To get the services of Java click on below link</h1>"); out.
		 * println("<a href='http://localhost:9999/OracleApp/index.html'>CC@WWW.oracleproducts</a>"
		 * ); out.println("</body>"); out.println("</html>"); out.close();
		 */
		String location = "http://localhost:9999/OracleApp/index.html";
		response.sendRedirect(location);

	}

}
