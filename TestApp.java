
import com.mysql.cj.jdbc.Driver;
import java.sql.*;

import javax.management.Query;
class TestApp
{
    public static void main(String[] args) throws SQLException
    {

      //step 1. Load and Register the Driver  
      Driver driver=new Driver();  
      DriverManager.registerDriver(driver);
      System.out.println("Driver registered successfully");
     

      //step 2.Establish the connection java and DB
      // JDBC URL SYNTAX ::<mainprotocol>:<subprotocal>:<subname>

      String url="jdbc:mysql://localhost:3306/enterprisejavabatch";
      String username="root";
      String password="Vikash@#123";
      Connection connection=DriverManager.getConnection(url,username,password);
      System.out.println("Connection object is created:: "+connection);
      
    //     System.out.println();
    //   System.out.println("implementation class name of connection is :: "+connection.getClass().getName());


      //step 3. create a Statement object
      Statement statement=connection.createStatement();
      System.out.println("statement object is created:: "+statement);
      


    //   step 4.    send and execute the Query
    /* Query
      1.DDL(create table,alter table,drop table,...)
      2.DML(insert update,delete)
      3.DCL(alter password,grant access)
      4.TCL(commit,rollback,savepoint)
      According to java Devloper perspective ,we categorise queries into 2 types
      1.select Query
      2.NonSelect Query


    */  
    
    String sqlSelectQuery="select stud_id,stud_name,marks from student";
    ResultSet resultSet=statement.executeQuery(sqlSelectQuery);
    System.out.println("ResultSet object is created:: "+resultSet);
    System.out.println("stud_id\tstud_name\tmarks");

    while(resultSet.next()){
        Integer id=resultSet.getInt(1);
        String name=resultSet.getString(2);
        Integer mark=resultSet.getInt(3);
        System.out.println(id+"\t"+name+"\t"+mark);
    }
     

    //step 6.close the connection
    connection.close();
    System.out.println("closing the connection");


    }
}