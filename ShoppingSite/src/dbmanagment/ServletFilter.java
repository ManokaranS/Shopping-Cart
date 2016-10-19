package dbmanagment;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class ServletFilter implements Filter {

    @Override
    public void destroy() {
    	// TODO Auto-generated method stub
    	
    }
    

	

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("filter called");
		
		HttpServletRequest request1=(HttpServletRequest) request;
		HttpServletResponse response1=(HttpServletResponse)response;
		
		HttpSession session=request1.getSession();
		
		System.out.println("filter called");
	    
	    if(session.isNew())
	    {
	    	
	    	String pagename=request.getParameter("id").toString().trim();
	    	if(pagename.equals("langform"))
	    	chain.doFilter(request, response);
	    	else
	    		response1.sendRedirect("error.jsp");
	    }
	    else
	    {
	    	chain.doFilter(request, response);
	    }
	    
	    
		
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
