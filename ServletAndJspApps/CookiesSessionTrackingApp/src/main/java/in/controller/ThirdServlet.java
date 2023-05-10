package in.controller;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/test3")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//collect data from parameters
    	
    	String man_date=request.getParameter("man_date");
    	String exp_date=request.getParameter("exp_date");
    	
    	/*
    	//Create a Cookie as per the user Requirement
    	
    	Cookie c3=new Cookie("man_date", man_date);
    	Cookie c4=new Cookie("exp_date", exp_date);
    	
    	
    	//send the Cookie Object through response
    	response.addCookie(c3);
    	response.addCookie(c4);
    	
    	//forword the repose to form3.html
    	
    	RequestDispatcher rd=request.getRequestDispatcher("/form3.html");
    	rd.forward(request, response);*/
    	
    	
    	Cookie[] cookies= request.getCookies();
    	String pid=cookies[0].getValue();
    	String pname=cookies[1].getValue();
    	String pcost=cookies[2].getValue();
    	String pquantity=cookies[3].getValue();
    	
    	
    	//sending the respose through html page
    	response.setContentType("text/html");
    	PrintWriter out=response.getWriter();
    	out.println("<center>");
    	
    	out.println("<table border='1'>");
    	out.println("<tr><th> pid </th><td>"+pid+"</td></tr>");
    	out.println("<tr><th> pname </th><td>"+pname+"</td></tr>");
    	out.println("<tr><th> pcost </th><td>"+pcost+"</td></tr>");
    	out.println("<tr><th> pquantity </th><td>"+pquantity+"</td></tr>");
    	out.println("<tr><th> man_date </th><td>"+man_date+"</td></tr>");
    	out.println("<tr><th> exp_date </th><td>"+exp_date+"</td></tr>");
    	out.println("</table>");
    	
    	out.println("</center>");
    	
    	
    	out.close();
    	
    	
    	
    	
    	
	}

	
}
