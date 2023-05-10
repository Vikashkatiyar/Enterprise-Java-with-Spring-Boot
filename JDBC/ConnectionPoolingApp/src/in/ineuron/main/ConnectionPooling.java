package in.ineuron.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;


public class ConnectionPooling {
	
	public static void main(String[]args) throws SQLException {
		MysqlConnectionPoolDataSource dataSource=new MysqlConnectionPoolDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/enterprisejavabatch");
		dataSource.setUser("root");
		dataSource.setPassword("Vikash@#123");
		
		
		Connection connection=null;
		Statement stmt=null;
		ResultSet resultSet=null;
		
		
		connection=dataSource.getConnection();
		if(connection!=null) {
			 stmt=connection.createStatement();
		}
		if(stmt!=null) {
			
			 resultSet=stmt.executeQuery("select stud_id,stud_name,marks from student");
		}
		if(resultSet!=null) {
			
			System.out.println("stud_id\tstud_name\tmarks");
			System.out.println("================================");
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t\t"+resultSet.getInt(3));
			}
			
		}
	    
		connection.close();
		stmt.close();
		resultSet.close();
	}
	
}
