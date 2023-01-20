package in.ineuron.dynamicinput;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//usage of Statement object leads to SQLInjection
public class SqlInjectionApp {

	public static void main(String[] args) throws SQLException {

		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "root123");

		Statement statement = connection.createStatement();

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the username :: ");
		String uname = scanner.next();

		System.out.print("Enter the password :: ");
		String password = scanner.next();

		uname = "'" + uname + "'";
		password = "'" + password + "'";

		String sqlSelectQuery = "select count(*) from users where username = " + uname + " and pwd=" + password
				+ "";

		ResultSet resultSet = statement.executeQuery(sqlSelectQuery);

		int count = 0;
		if (resultSet.next()) {
			count = resultSet.getInt(1);
		}

		if (count == 1)
			System.out.println("valid credentials");
		else
			System.out.println("invalid credentials");

		scanner.close();
		resultSet.close();
		statement.close();
		connection.close();

	}

}
