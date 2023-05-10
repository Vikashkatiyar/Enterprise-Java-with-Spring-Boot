package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.entity.User;

public class UserDao {
    private Connection conn;

	public UserDao(Connection conn) {
		super();
		this.conn = conn;
	}
   
    public boolean register(User u) {
    	boolean flag=false;
    	
    	try {
    		String sqlQuery="insert into user_dtls(full_name,email,password) values (?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sqlQuery);
			
			ps.setString(1, u.getFullName());
			ps.setString(2, u.getEmail());
			ps.setString(1, u.getPassword());
			
			int noOfRowEffected=ps.executeUpdate();
			
			if(noOfRowEffected==1) {
				flag=true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	return flag;
    }
   
}
