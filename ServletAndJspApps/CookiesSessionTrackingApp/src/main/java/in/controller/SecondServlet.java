package in.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/test2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//collect data from parameters
    	
    	String pcost=request.getParameter("pcost");
    	String pquantity=request.getParameter("pquantity");
    	
    	//Create a Cookie as per the user Requirement
    	
    	Cookie c3=new Cookie("pcost", pcost);
    	Cookie c4=new Cookie("pquantity", pquantity);
    	
    	
    	//send the Cookie Object through response
    	response.addCookie(c3);
    	response.addCookie(c4);
    	
    	//forword the repose to form3.html
    	
    	RequestDispatcher rd=request.getRequestDispatcher("/form3.html");
    	rd.forward(request, response);
    	
	}

	
}
