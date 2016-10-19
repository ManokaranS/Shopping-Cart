package dbmanagment;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;

import javax.servlet.http.HttpSessionListener;




public class SessionListner implements HttpSessionListener {

  
    public void sessionCreated(HttpSessionEvent event)  { 
    		
    	HttpSession session=event.getSession();
    	System.out.println("Session Has been created "+session.isNew());
    }

	
    public void sessionDestroyed(HttpSessionEvent event)  { 
        
    	String uname=event.getSession().getAttribute("username").toString();
    	HiberAction h=new HiberAction();
    	
    	h.changestatus(uname, 0);
    	
    	System.out.println("session has been destroyed");
    	
    	
    }
	
}
