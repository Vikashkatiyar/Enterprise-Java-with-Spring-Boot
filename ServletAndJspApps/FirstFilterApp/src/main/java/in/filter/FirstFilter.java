package in.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;


@WebFilter("/test")
public class FirstFilter extends HttpFilter implements Filter {
	
    static {
    	System.out.println("Filter loading...");
    }
    
    public FirstFilter() {
       System.out.println("Filter Instantiatio.....");
    }

	
    public void init(FilterConfig fConfig) throws ServletException {
    	System.out.println("Filter initialization......");
    }

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out=response.getWriter();
		out.println("<h1>This Work is done before filter</h1>");
		
		
		chain.doFilter(request, response);
		
		
		out.println("<h1>This Work is done after filter</h1>");
		
		out.close();
		
		
		
	}

	public void destroy() {
		System.out.println("Filter De-Intantiation.....");
	}
	

}
