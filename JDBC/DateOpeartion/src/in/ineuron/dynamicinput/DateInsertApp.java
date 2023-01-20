package in.ineuron.dynamicinput;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import in.ineuron.jdbcUtil.JdbcUtil;

public class DateInsertApp {

	public static void main(String[] args) throws ParseException {

		// resource used
		Connection connection = null;
		PreparedStatement pstmt = null;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the name:: ");
		String name = scanner.next();

		System.out.print("Enter the dob::(dd-mm-YYYY) ");
		String sdob = scanner.next();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date uDate = sdf.parse(sdob);

		long time = uDate.getTime();
		java.sql.Date sqlDate = new java.sql.Date(time);

		System.out.println("String dob is  :: " + sdob);
		System.out.println("Util date is   :: " + uDate);
		System.out.println("SQL  date is   :: " + sqlDate);

		String sqlInsertQuery = "insert into userdata(`name`,`dob`) values (?,?)";

		try {

			connection = JdbcUtil.getJdbcConnection();

			if (connection != null)
				pstmt = connection.prepareStatement(sqlInsertQuery);

			if (pstmt != null) {
				pstmt.setString(1, name);
				pstmt.setDate(2, sqlDate);

				int rowAffected = pstmt.executeUpdate();

				System.out.println("No of rows affected is:: " + rowAffected);
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				JdbcUtil.closeConnection(null, pstmt, connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if (scanner != null) {
				scanner.close();
			}
		}

	}

}
