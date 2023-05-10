package in.ineuron.main;

//rt.jar=> jdk software
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//MYSQL-JAR=> given by mysql db vendor
import com.mysql.cj.jdbc.Driver;

public class UpdateApp {

	public static void main(String[] args) throws SQLException
	{   
		
		Connection connection=null;
		Statement statement=null;
		
       
       
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
    			   String updateSqlQuery="update student set marks=200 where stud_name='Arpit' ";
    			    int noOfRows=statement.executeUpdate(updateSqlQuery);
    			    System.out.println("No of rows updated is:: "+noOfRows);
    		   }
    	   }
    	   
       }catch(SQLException se) {
    	   se.printStackTrace();
       }catch(Exception e) {
    	   e.printStackTrace();
       }finally {
			
			
			if(statement!=null) {
				statement.close();
			}
			
			if(connection!=null) {
				connection.close();	
			}
	   }
       
       
       
	}

}
