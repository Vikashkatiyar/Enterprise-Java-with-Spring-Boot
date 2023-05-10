package in.controller;

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
@WebServlet(
		urlPatterns = {"/reg" }, 
		initParams = { 
				@WebInitParam(name = "url", value = "jdbc:mysql:///enterprisejavabatch"), 
				@WebInitParam(name = "user", value = "root"), 
				@WebInitParam(name = "password", value = "Vikash@#123")
		})
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Connection connection = null;
       
    static {
    	System.out.println("register Servlet class is loading.....");
    }
    public RegisterServlet() {
       System.out.println("Register Servlet class is instantiation.....");
    }
    
   @Override
	public void init() throws ServletException {
		System.out.println("Register Servlet class is initialized.....");
		
	    ServletConfig config =	getServletConfig();
	    
	    String urlString=config.getInitParameter("url");
	    String userString=config.getInitParameter("user");
	    String passwordString=config.getInitParameter("password");
	    
	    try {
	    	 Class.forName("com.mysql.cj.jdbc.Driver");
			 connection=DriverManager.getConnection(urlString,userString,passwordString);
		} catch (SQLException e) {
			//  TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	
	public  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //1.get the data from request object
		
		  String nameString=request.getParameter("name");
		  String emailString= request.getParameter("email");
		  String cityString=request.getParameter("city");
		  String countryString=request.getParameter("country");
		
		//2. use JDBC API code to send the data to database
		  
		  String sqlInsertQuery="insert into student(`name`,`email`,`city`,`country`) values(?,?,?,?)";
		  PreparedStatement pstmt=null;
		  int rowCount =0;
		  
		  try {
			  if(connection!=null) {
				  
				  pstmt=connection.prepareStatement(sqlInsertQuery);
			  }
			  if(pstmt!=null) {
				  pstmt.setString(1, nameString);
				  pstmt.setString(2, emailString);
				  pstmt.setString(3, cityString);
				  pstmt.setString(4, countryString);
				  
				  rowCount=pstmt.executeUpdate();
			  }
		  } catch (SQLException e) {
			e.printStackTrace();
		  }catch (Exception e) {
			// TODO: handle exception
			  e.printStackTrace();
		}
		 
		
		//3.Prepare a response and it to the user
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
		  

		  
		  
		//4.close the resourses
			out.close();
		
		
	}

}
