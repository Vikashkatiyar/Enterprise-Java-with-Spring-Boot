package in.ineuron.main;


import java.sql.CallableStatement;
//rt.jar=> jdk software
import java.sql.Connection;


import java.sql.ResultSet;
import java.sql.SQLException;



/*
 * StoredProcedure-> 
		DELIMITER $$
		USE `enterprisejavabatch`$$
		CREATE PROCEDURE `getStudents` (id int)
		BEGIN
		    Select stud_id,stud_name,marks from student where stud_id=id;
		END$$
		
		DELIMITER ;
		
		call getStudents(25); 
*/

import in.ineuron.jdbcUtil.*;

public class RetriveStudentRecordApp {

	public static void main(String[] args) throws SQLException
	{   
		
	Connection connection=null;
    CallableStatement cstmt=null;
    ResultSet resultset=null;
    Integer id=2;
    
     
     
     try {
  	  connection=JdbcConnection.getJdbcConnection();
  	  
  	  String storedprocedure="{call getStudents(?)}";
  	  
  	  if(connection!=null) {
  		  cstmt=connection.prepareCall(storedprocedure);
  	  }
  	  if(cstmt!=null) {
  		  //before calling set the input value to StoredProcedure
  		  cstmt.setInt(1, id);//(index,id)
  		  
  		  //execute the StoredProcedure
  		  cstmt.execute();
  		  resultset=cstmt.getResultSet();
  	  }
  	  if(resultset!=null) {
  		  if(resultset.next())
  		     System.out.println(resultset.getInt(1)+"\t"+resultset.getString(2)+"\t"+resultset.getInt(3));
  		  else
  			  System.out.println("Record Not Found for Given Id.......");
  	  }
  	   
     }catch(SQLException se) {
  	   se.printStackTrace();
     }catch(Exception e) {
  	   e.printStackTrace();
     }finally {
    	 JdbcConnection.closeConnection(resultset, cstmt, connection);
    	 
     }
  }

}

