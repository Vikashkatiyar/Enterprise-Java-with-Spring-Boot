package in.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/test2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		//Collect request Parameter data
		String qual=request.getParameter("qual");
		String design=request.getParameter("design");
		
		
		
		// Create a session object and store these request parameters
		//data in session
		HttpSession session=request.getSession();
		session.setAttribute("qual", qual);
		session.setAttribute("design", design);
		
		
		
		
		//forword the respose to form3.html
		RequestDispatcher rd=request.getRequestDispatcher("/form3.html");
		rd.forward(request, response);
		
		
	
	}
	

}
