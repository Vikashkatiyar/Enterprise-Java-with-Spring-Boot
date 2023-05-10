package in.ineuron.main;

//rt.jar=> jdk software
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//MYSQL-JAR=> given by mysql db vendor
import com.mysql.cj.jdbc.Driver;

public class SelectApp {

	public static void main(String[] args) throws SQLException
	{   
		
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
       
       
       //2.establish the connection
       String url="jdbc:mysql://localhost:3306/enterprisejavabatch";//it automatically load the class
       String user="root";
       String password="Vikash@#123";
       
       try {
    	   connection=DriverManager.getConnection(url,user,password);
    	   if(connection!=null) {
    		   //3.Creation of statement Object (to move to the location using connection)
    		    statement=connection.createStatement();
    		   
    		   if(statement!=null) {
    			   //4.Using Statement Object execute the Query
    			   String sqlselectQuery="select stud_id,stud_name,marks from student";
    			    resultSet=statement.executeQuery(sqlselectQuery);
    			    
    			    if(resultSet!=null) {
    			    	
    			    	System.out.println("stud_id\tstud_name\tmarks");
    			    	
    			    	while(resultSet.next()) {
    			    		int sid=resultSet.getInt("stud_id");
    			    		String sname=resultSet.getString("stud_name");
    			    		int smark=resultSet.getInt("marks");
    			    		
    			    		System.out.println(sid+"\t"+sname+"\t\t"+smark);
    			    	}
    			    	
    			    }
    		   }
    	   }
    	   
       }catch(SQLException se) {
    	   se.printStackTrace();
       }catch(Exception e) {
    	   e.printStackTrace();
       }finally {
			if(resultSet!=null) {
				resultSet.close();	
			}
			
			if(statement!=null) {
				statement.close();
			}
			
			if(connection!=null) {
				connection.close();	
			}
	   }
       
       
       
	}

}
