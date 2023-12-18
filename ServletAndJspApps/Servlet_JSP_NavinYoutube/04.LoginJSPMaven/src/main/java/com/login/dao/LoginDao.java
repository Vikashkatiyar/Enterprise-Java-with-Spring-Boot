package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	
	String url="jdbc:mysql://localhost:3306/navin";
	String username="root";
	String password="Vikash@#123";
	String query="select * from login where uname=? and pass=?";
	
   public boolean check(String uname,String pass) {
	  
	   try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection(url,username,password);
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setString(1,uname);
		statement.setString(2,pass);
		
		ResultSet resultSet = statement.executeQuery();
		if(resultSet.next()) {
			return true;
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   
	   
	   return false;
	   
   }
   
   
}
