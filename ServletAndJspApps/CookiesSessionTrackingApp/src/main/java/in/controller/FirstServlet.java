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
@WebServlet("/test1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//collect data from parameters
    	
    	String pid=request.getParameter("pid");
    	String pname=request.getParameter("pname");
    	
    	//Create a Cookie as per the user Requirement
    	
    	Cookie c1=new Cookie("pid", pid);
    	Cookie c2=new Cookie("pname", pname);
    	
    	
    	//send the Cookie Object through response
    	response.addCookie(c1);
    	response.addCookie(c2);
    	
    	//forword the repose to form2.html
    	
    	RequestDispatcher rd=request.getRequestDispatcher("/form2.html");
    	rd.forward(request, response);
    	
	}

	
}
