package in.ineuron.dynamicinput;

//rt.jar=> jdk software
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//MYSQL-JAR=> given by mysql db vendor


public class InsertApp {

	public static void main(String[] args) throws SQLException
	{   
		
		Connection connection=null;
		Statement statement=null;
		
     
     
     //2.establish the connection
     String url="jdbc:mysql://localhost:3306/enterprisejavabatch";//it automatically load the class
     String user="root";
     String password="Vikash@#123";
     
     
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter the Stud_id : ");
     int sid=scanner.nextInt();
     
     System.out.println("Enter the stud_name :: ");
     String sname=scanner.next();
     
     System.out.println("Enter the marks:: ");
     int smark=scanner.nextInt();
     
     //convert String("") to varchar('')
     //sname="'"+sname+"'";
         //OR use String Format api
     
     
     
     try {
  	   connection=DriverManager.getConnection(url,user,password);
  	   if(connection!=null) {
  		   //3.Creation of statement Object (to move to the location using connection)
  		    statement=connection.createStatement();
  		   
  		   if(statement!=null) {
  			   //4.Using Statement Object execute the Query
  			   String insertSqlQuery=String.format("insert into student(`stud_id`,`stud_name`,`marks`) values(%d,'%s',%d)",sid,sname,smark);
  			   System.out.println(insertSqlQuery);
  			    int noOfRows=statement.executeUpdate(insertSqlQuery);
  			    System.out.println("No of rows affected is:: "+noOfRows);
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
			if(scanner!=null) {
				scanner.close();
			}
	   }
     

	}

}

