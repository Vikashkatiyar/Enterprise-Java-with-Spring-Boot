package in.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	
	@Override
	public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		
		if(name.equals("vikash") && password.equals("katiyar")) {
			//valid page redirect to index.jsp
			
			ServletContext context=getServletContext();
			RequestDispatcher rd=context.getRequestDispatcher("/inbox.jsp");
			rd.forward(request, response);
		}else {
			// invalid page redirect to error.jsp
			RequestDispatcher rd=request.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
			
			
		}
	}

}
