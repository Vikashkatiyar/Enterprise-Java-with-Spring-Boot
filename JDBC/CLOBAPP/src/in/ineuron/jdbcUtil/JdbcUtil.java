package in.ineuron.jdbcUtil;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcUtil {
	
	private JdbcUtil() {
		
	}
    
	public  static Connection getJdbcConnection() throws SQLException {
		Connection connection=null;
		
		
		
		//2.establish the connection
		String url="jdbc:mysql://localhost:3306/enterprisejavabatch";//it automatically load the class
		String user="root";
		String password="Vikash@#123";
		
		
		connection=DriverManager.getConnection(url,user,password);
		if(connection!=null) {
			return connection;
		}
		
		return connection;
	}
	
	public static void closeConnection(ResultSet resultSet,Statement statement,Connection connection) throws SQLException {
		
			
			if(resultSet!=null) {
				resultSet.close();
			}
			if (statement != null) {
				statement.close();
			}

			if (connection != null) {
				connection.close();
			} 
		
	}
	
}
