import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import javax.servlet.*;


@WebServlet("/test")
public class FirstServlet extends HttpServlet 
{
	static{
		System.out.println("Servlet loading...");
	}
	public FirstServlet(){
		System.out.println("Servlet Instantiation....");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
	{
		System.out.println("Request type is POST");
	}
}
