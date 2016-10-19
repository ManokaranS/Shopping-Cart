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

import org.hibernate.Session;
import sun.security.krb5.Config;

public class MyFilter implements Filter {

    
    public MyFilter() {
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse rep=(HttpServletResponse)response;
		HttpSession session=req.getSession();

	   String id=request.getParameter("id").toString().trim();
	  // System.out.println(id);
	   
	   if(session.isNew())
	   {
		   if(id.equals("language"))
		   {	  
		   chain.doFilter(request, response);
		   }
		   else
	   		{
		   rep.sendRedirect("DestroySession.jsp");  
	   		}
	   }
	   
	  chain.doFilter(request, response);
	  
	}	

	
	public void init(FilterConfig fConfig) throws ServletException {
		
		System.out.println("init called....");
	}

}
