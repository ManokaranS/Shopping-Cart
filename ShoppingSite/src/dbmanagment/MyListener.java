package dbmanagment;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import org.hibernate.Session;

public class MyListener implements HttpSessionListener {

   
    public MyListener() {
        // TODO Auto-generated constructor stub
    }

	
    public void sessionCreated(HttpSessionEvent event)  { 
    	System.out.println("Session created.......");
    }

    public void sessionDestroyed(HttpSessionEvent event)  {
    	HiberAction h=new HiberAction();
    	HttpSession session=event.getSession();
    	Object o=session.getAttribute("username");
    	System.out.println(o.toString());
    	if(o!=null)
        {
    	h.changestatus(o.toString(), 0);
    	System.out.println("Session Destroyed...");
        }
    }
	
}
