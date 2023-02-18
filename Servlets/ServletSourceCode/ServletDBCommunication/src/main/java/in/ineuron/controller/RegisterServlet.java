package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet(urlPatterns = { "/reg" }, initParams = {
		@WebInitParam(name = "url", value = "jdbc:mysql:///enterprisejavabatch"),
		@WebInitParam(name = "user", value = "root"), @WebInitParam(name = "password", value = "root123") })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection = null;

	static {
		System.out.println("RegisterServlet class is loading...");
	}

	public RegisterServlet() {
		System.out.println("Register Servlet class is instantiated...");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Register Servlet class is initialzied");

		ServletConfig config = getServletConfig();
		String url = config.getInitParameter("url");
		String user = config.getInitParameter("user");
		String password = config.getInitParameter("password");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. Get the data from Request object
		String name = request.gregistretParameter("name");
		String email = request.getParameter("email");
		String city = request.getParameter("city");
		String country = request.getParameter("country");

		// 2. use JDBC API code to send the data to database

		String sqlInsertQuery = "insert into student(`name`,`email`,`city`,`country`) values(?,?,?,?)";
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			if (connection != null)
				pstmt = connection.prepareStatement(sqlInsertQuery);
			if (pstmt != null) {
				pstmt.setString(1, name);
				pstmt.setString(2, email);
				pstmt.setString(3, city);
				pstmt.setString(4, country);

				rowCount = pstmt.executeUpdate();
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 3. Prepare a response and send it to the end user
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html><head><title>OUTPUT</title></head>");
		out.println("<body>");
		if (rowCount == 1)
			out.println("<h1 style='color:green;text-align:center;'>REGISTERED SUCCESFULLY</h1>");
		else {
			out.println("<h1 style='color:red;text-align:center;'>REGISTRATION FAILED</h1>");
			out.println("<a style='text-align:center;' href='./register.html'>register again</a>");
		}

		out.println("</body>");
		out.println("</html>");
		out.close();

	}

}
