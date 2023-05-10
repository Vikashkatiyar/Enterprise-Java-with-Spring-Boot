package in.ineuron.dynamicinput;


//rt.jar=> jdk software
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



//MYSQL-JAR=> given by mysql db vendor

import in.ineuron.jdbcUtil.*;

public class SelectApp {

	public static void main(String[] args) throws SQLException
	{   
		
	Connection connection=null;
    PreparedStatement pstmt=null;
    ResultSet resultset=null;
    
     
     String sqlSelectQuery="select stud_id,stud_name,marks from student";
     try {
  	  connection=JdbcConnection.getJdbcConnection();
  	  if(connection!=null) {
  		  pstmt=connection.prepareStatement(sqlSelectQuery);
  	  }
  	  if(pstmt!=null) {
  		  
  		  resultset=pstmt.executeQuery();
  		  System.out.println("stud_id\tstud_name\tmarks");
    	
    	  while(resultset.next()) {
    		int sid=resultset.getInt("stud_id");
    		String sname=resultset.getString("stud_name");
    		int smark=resultset.getInt("marks");
    		
    		System.out.println(sid+"\t"+sname+"\t\t"+smark);
    	}
  		  
  	  }
  	  
  	   
     }catch(SQLException se) {
  	   se.printStackTrace();
     }catch(Exception e) {
  	   e.printStackTrace();
     }finally {
    	 JdbcConnection.closeConnection(resultset, pstmt, connection);
    	 
     }
  }

}

