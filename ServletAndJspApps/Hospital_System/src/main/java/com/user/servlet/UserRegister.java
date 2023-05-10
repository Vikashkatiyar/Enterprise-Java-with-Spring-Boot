package com.user.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.db.DBConect;
import com.entity.User;

/**
 * Servlet implementation class UserRegister
 */
@WebServlet("/user_register")
public class UserRegister extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
			String fullName=request.getParameter("fullname");
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			
			//Set the values of User
			User u=new User(fullName,email,password);
			
			
			//Now register the user using Userdao class
			UserDao dao= new UserDao(DBConect.getConn());
			boolean f= dao.register(u);
			if(f) {
				System.out.println("Register Succefull");
			}else {
				System.out.println("Something wrong on server ");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
