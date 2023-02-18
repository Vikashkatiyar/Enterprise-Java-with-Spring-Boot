package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test1")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");

		if (uname.equals("sachin") && upwd.equals("tendulkar")) {
			// valid page redirect to inbox.jsp
			ServletContext context = getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher("/inbox.jsp");
			rd.forward(request, response);

		} else {
			// invalid page redirec to error.jsp
			RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
		}

	}

}
