package in.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet( urlPatterns = "/test1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	request.setAttribute("vikash", "JAVA");
    	request.setAttribute("virat", "Cricketer");
    	
    	RequestDispatcher rd=request.getRequestDispatcher("/test2");
    	rd.forward(request, response);
	}

}
