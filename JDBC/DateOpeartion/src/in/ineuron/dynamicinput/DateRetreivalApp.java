package in.ineuron.dynamicinput;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import in.ineuron.jdbcUtil.JdbcUtil;

public class DateRetreivalApp {

	public static void main(String[] args) throws ParseException {

		// resource used
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet resultSet = null;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the name:: ");
		String name = scanner.next();

		String sqlSelectQuery = "select name,dob from userdata where name = ?";

		try {

			connection = JdbcUtil.getJdbcConnection();

			if (connection != null)
				pstmt = connection.prepareStatement(sqlSelectQuery);

			if (pstmt != null) {
				pstmt.setString(1, name);
				resultSet = pstmt.executeQuery();
			}
			if (resultSet != null) {

				if (resultSet.next()) {
					
					String userName = resultSet.getString(1);
					java.sql.Date userDob = resultSet.getDate(2);
					System.out.println("SQLDate present in database is :: "+userDob);
					// formatting the output as the user choice(based on locale)
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String date = sdf.format(userDob);
					System.out.println("NAME IS :: " + userName);
					System.out.println("DOB  IS :: " + date);
				
				} else {
					System.out.println("Record not available for the given name: " + name);
				}

			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				JdbcUtil.closeConnection(resultSet, pstmt, connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if (scanner != null) {
				scanner.close();
			}
		}

	}

}
