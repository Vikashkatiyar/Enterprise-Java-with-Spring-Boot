package in.ineuron.dynamicinput;


//rt.jar=> jdk software
import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.SQLException;

import java.util.Scanner;

//MYSQL-JAR=> given by mysql db vendor

import in.ineuron.jdbcUtil.*;

public class InsertApp {

	public static void main(String[] args) throws SQLException
	{   
		
	Connection connection=null;
    PreparedStatement pstmt=null; 
    
    
     Scanner scanner=new Scanner(System.in);
     System.out.print("Enter the Stud_id : ");
     int sid=scanner.nextInt();
     
     System.out.print("Enter the stud_name :: ");
     String sname=scanner.next();
     
     System.out.print("Enter the marks:: ");
     int smark=scanner.nextInt();
     
     //convert String("") to varchar('')
     //sname="'"+sname+"'";
         //OR use String Format api
     
     
     String sqlInsertQuery="insert into student(`stud_id`,`stud_name`,`marks`) values(?,?,?)";
     try {
  	  connection=JdbcConnection.getJdbcConnection();
  	  if(connection!=null) {
  		  pstmt=connection.prepareStatement(sqlInsertQuery);
  	  }
  	  if(pstmt!=null) {
  		  pstmt.setInt(1,sid);
  		  pstmt.setString(2,sname);
  		  pstmt.setInt(3, smark);
  		  
  		  int rowAffected=pstmt.executeUpdate();
  		  System.out.println("No of rows Affected is :: "+rowAffected);
  		  
  	  }
  	  
  	   
     }catch(SQLException se) {
  	   se.printStackTrace();
     }catch(Exception e) {
  	   e.printStackTrace();
     }finally {
    	 JdbcConnection.closeConnection(null, pstmt, connection);
    	 if(scanner!=null) {
    		 scanner.close();
    	 }
     }
  }

}

