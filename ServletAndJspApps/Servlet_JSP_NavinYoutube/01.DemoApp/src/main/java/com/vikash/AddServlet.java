package com.vikash;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		int k = i + j;

		/*
		 * HttpSession session = request.getSession(); session.setAttribute("k", k);
		 */

		/*
		 * Request Dispacher RequestDispatcher dispatcher =
		 * request.getRequestDispatcher("sq"); request.setAttribute("k", k);
		 * dispatcher.forward(request, response);
		 */
		Cookie cookie=new Cookie("k", k+"");
		response.addCookie(cookie);
		
		
		 response.sendRedirect("sq"); 

	}

}
