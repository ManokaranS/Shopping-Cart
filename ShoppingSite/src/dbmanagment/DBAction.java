package dbmanagment;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Controller;

import JdbcOperation.JDBCUtility;
@Controller
public class DBAction {
	
public boolean checkuser(String username,String password){
	Connection con=JDBCUtility.GetConnection();
	PreparedStatement pre;
	try{
		pre=con.prepareStatement("select * from user where username=? AND password=?");
		pre.setString(1, username);
		pre.setString(2, password);
		ResultSet rs=pre.executeQuery();
		if(rs.next())
		{
			return true;
		}else
		{
			return false;
		}
	}catch(Exception e)
	{
		System.out.println("Check user error"+e);
	}
	return false;
}
public boolean checkstatus(String username){
	Connection con=JDBCUtility.GetConnection();
	PreparedStatement pre;
	try
	{
		pre=con.prepareStatement("select status from user where username=?");
		pre.setString(1, username);
		ResultSet rs=pre.executeQuery();
		rs.next();
		if(rs.getInt("status")==1)
		{
			return false;
		}else
		{
			return true;
		}
	}catch(Exception e){
		System.out.println("Check status error");
	}
	return false;
}
public boolean changestatus(String username,int status)
{
	Connection con=JDBCUtility.GetConnection();
	PreparedStatement pre;
	try
	{
		pre=con.prepareStatement("update user set status=? where username=?");
		pre.setInt(1, status);
		pre.setString(2, username);
		System.out.println("change Status");
		if(pre.executeUpdate()==1)
		{
			
			System.out.println("change status success");
			JDBCUtility.CloseConnection(null);
			return true;
		}else
		{
			System.out.println("change status failure");
			return false;
		}
	}catch(Exception e){
		System.out.println("change status error occured	"+e);
		JDBCUtility.CloseConnection(e);
	}
	return false;
}
public boolean checkuser(String username) {
	Connection con=JDBCUtility.GetConnection();
	PreparedStatement pre;
	try{
		pre=con.prepareStatement("select * from user where username=?");
		pre.setString(1, username);
		
		ResultSet rs=pre.executeQuery();
		if(rs.next())
		{
			return true;
		}else
		{
			return false;
		}
	}catch(Exception e)
	{
		System.out.println("Check user error");
	}
	return false;
}
public boolean Register(String uname,String password)
{
	Connection con = JDBCUtility.GetConnection();
	PreparedStatement prep;
	try {
		prep = con.prepareStatement("insert into user(username,password,status) values(?,?,?)");
		
		prep.setString(1,uname);
		prep.setString(2,password);
		prep.setInt(3,0);
		
		if(prep.executeUpdate()==1)
		{
			
			JDBCUtility.CloseConnection(null);
			return true;
		}
		else
		{
			
			return false;
		}
		
		
	} catch (Exception e) {
		System.err.println("Error Occured  in insert:" + e);
	}

	
	
	return false;
}
public static void main(String[] args) {
	DBAction dba=new DBAction();
	dba.changestatus("ramu", 1);
}
}
