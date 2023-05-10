package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConect {

	private static Connection conn;
	
	public static  Connection getConn() {
		try {
			
       		Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_system","root","Vikash@#123");
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return conn;
	}
	
	

}
