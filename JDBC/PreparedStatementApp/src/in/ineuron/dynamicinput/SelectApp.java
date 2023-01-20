package in.ineuron.dynamicinput;

// rt.jar => jdk s/w
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import in.ineuron.jdbcUtil.JdbcUtil;

public class SelectApp {

	public static void main(String[] args) throws SQLException {

		// Resource used in jdbc
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet resultSet = null;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the sid: ");
		int sid = scanner.nextInt();

		String sqlSelectQuery = "select sid,sname,sage,saddr from student where sid=?";

		try {
			connection = JdbcUtil.getJdbcConnection();
			if (connection != null)
				pstmt = connection.prepareStatement(sqlSelectQuery);
			if (pstmt != null) {
				pstmt.setInt(1, sid);
				resultSet = pstmt.executeQuery();
			}
			if (resultSet != null) {
				if (resultSet.next()) {
					System.out.println("SID\tSNAME\tSAGE\tSADDR");
					System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3)
							+ "\t" + resultSet.getString(4));
				} else {
					System.out.println("Record not available for the given id:: " + sid);
				}
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.closeConnection(resultSet, pstmt, connection);
			if (scanner != null)
				scanner.close();
		}

	}

}
