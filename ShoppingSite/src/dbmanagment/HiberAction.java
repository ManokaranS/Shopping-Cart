package dbmanagment;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HiberAction {
	Session session;
	
	public boolean checkuser(String username,String password)
	{
		 session=SessionUtility.GetSessionConnection();
		
		String hql = "FROM UsersEntity where username = :username and password = :password";
		
		Query query = session.createQuery(hql);
		
		query.setParameter("username",username);
		query.setParameter("password", password);
		@SuppressWarnings("unchecked")
		List<UsersEntity> results = query.list();
		
		Iterator<UsersEntity> it=results.iterator();
		
		if (it.hasNext()) {
			System.out.println("username Checked");
			return true;
		}
		else
		{
			System.out.println("username check failed");
		return false;
		}
	
	}
	
	
	public boolean changestatus(String uname,int status)
	{
		 session=SessionUtility.GetSessionConnection();
		
		Query query = session.createQuery("update UsersEntity set status = :statusval where username = :unameval");
		
		query.setParameter("statusval",status);
		query.setParameter("unameval",uname);
		
		if (query.executeUpdate()==1) {
			
			SessionUtility.closeSession(null);
			return true;
		}
		else
		{
			return false;
		}
		
		
		
	}
	
	public boolean checkUserAndPassword(String uname,String password){
		
		
		 session=SessionUtility.GetSessionConnection();	
		String hql = "FROM UsersEntity where username = :username AND password= :password";
		Query query = session.createQuery(hql);
		query.setParameter("username",uname);
		query.setParameter("password",password);
		
		
		@SuppressWarnings("unchecked")
		List<UsersEntity> results = query.list();
		
		Iterator<UsersEntity> it=results.iterator();	
		
		if (it.hasNext()) {
			
			return true;
		}
		else
		{
			
		return false;
		}	
	}
	
	
	public boolean checkstatus(String uname)
	{
		
		 session=SessionUtility.GetSessionConnection();
		
		String hql = "FROM UsersEntity where username = :username";
		
		Query query = session.createQuery(hql);
		
		query.setParameter("username",uname);
		
		@SuppressWarnings("unchecked")
		List<UsersEntity> results = query.list();	
		Iterator<UsersEntity> it=results.iterator();
		UsersEntity un=it.next();
		if (un.getStatus()==1) {
			System.out.println("status 1");
			return false;
		}
		else
		{
		System.out.println("status 0");
		return true;
		}
		
	}
	
	
	
	public boolean Register(String uname,String password,int status)
	{
		 session=SessionUtility.GetSessionConnection(); 
		 UsersEntity e=new UsersEntity();
		
		 e.setUsername(uname);
		 e.setPassword(password);
		 e.setStatus(0);
		 
		 try{
		 session.save(e);	 
		 SessionUtility.closeSession(null);
		 
		 return true;
		 }
		 catch(Exception e1)
		 {
			 System.out.println("failed insert"+e1);
			 return false;
		 }

	}
	public boolean checkuser(String username)
	{
		 session=SessionUtility.GetSessionConnection();
		
		String hql = "FROM UsersEntity where username = :username";
		
		Query query = session.createQuery(hql);
		
		query.setParameter("username",username);
	
		@SuppressWarnings("unchecked")
		List<UsersEntity> results = query.list();
		
		Iterator<UsersEntity> it=results.iterator();
		
		if (it.hasNext()) {
			System.out.println("username Checked");
			return true;
		}
		else
		{
			System.out.println("username check failed");
		return false;
		}
	
	}
//public static void main(String[] args) {
//	HiberAction h=new HiberAction();
//	System.out.println(h.checkuser("ramu", "secret"));
//	System.out.println(h.checkstatus("ramu"));
//	System.out.println(h.changestatus("ramu", 0));
//	System.out.println(h.Register("guna", "secret", 0));
//}
}
