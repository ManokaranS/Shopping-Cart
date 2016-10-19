package dbmanagment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtility {
	
	static SessionFactory fact;
	static{
		
	
		
			Configuration config=new Configuration().configure("hibernate.cfg.xml");
			fact=config.buildSessionFactory();
	}
	
	
	private static final ThreadLocal<Session> tlocal=new ThreadLocal<Session>();
	
	
	static Session GetSessionConnection() {
		
			
			Session session=tlocal.get();
		
		
		if(session==null)
		{
			
			session=fact.openSession();
			tlocal.set(session);
			System.out.println("Connection Creation Success");
			
			return session;
			
		}
		else
		{	
			return session;
			
			
		}
		
		
	}
	
	@SuppressWarnings("null")
	public static void closeSession(Exception e)
	{
		Session session=tlocal.get();
		
		if (session!=null) {
			if (e==null) {
				session.beginTransaction().commit();
				session.close();
				tlocal.remove();
			}
		}
		else
		{
			session.beginTransaction().rollback();
			session.close();
			tlocal.remove();
		}
	}
}
