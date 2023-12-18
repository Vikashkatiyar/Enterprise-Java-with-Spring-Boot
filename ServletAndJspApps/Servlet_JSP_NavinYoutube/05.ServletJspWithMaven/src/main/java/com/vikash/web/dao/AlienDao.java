package com.vikash.web.dao;

import java.sql.*;
import com.vikash.web.model.Alien;

public class AlienDao {

	String url = "jdbc:mysql://localhost:3306/navin";
	String username = "root";
	String password = "Vikash@#123";

	public Alien getAlien(int uid) {

		Alien alien = new Alien();
		

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement st=conn.createStatement();
			ResultSet resultSet = st.executeQuery("select * from alien where uid=" + uid);
			if(resultSet.next()) {
				alien.setUid(resultSet.getInt("uid"));
				alien.setUname(resultSet.getString("uname"));
				alien.setPass(resultSet.getString("pass"));
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		return alien;

	}

}
