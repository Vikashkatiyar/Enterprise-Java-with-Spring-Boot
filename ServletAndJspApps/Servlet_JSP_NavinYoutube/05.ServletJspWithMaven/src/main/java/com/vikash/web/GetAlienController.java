package com.vikash.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vikash.web.dao.AlienDao;
import com.vikash.web.model.Alien;


public class GetAlienController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int aid = Integer.parseInt(request.getParameter("uid"));
		
		
		AlienDao dao=new AlienDao();
		Alien alien1=dao.getAlien(aid);
		
		request.setAttribute("alien",alien1);
		
		RequestDispatcher rd=request.getRequestDispatcher("showAlien.jsp");
		rd.forward(request, response);
		
	}

}
