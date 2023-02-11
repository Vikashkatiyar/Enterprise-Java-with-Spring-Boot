package Trial1;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("Hyder")
public class DemoServlet extends HttpServlet
{
	public void init()
	{
		
	}
	public void service(HttpServletRequest request, HttpServletResponse response)
	{
		try {
		System.out.println("conntroll is coming to servlet");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("Control came to servlet and this is response from servlet");
		}
		catch(Exception e)
		{
			System.out.println("Some exception");
		}
		
	}
	public void destroy()
	{
		
	}

}
