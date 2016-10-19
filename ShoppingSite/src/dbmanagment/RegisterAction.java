package dbmanagment;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import JdbcOperation.JDBCUtility;
@Controller
@RequestMapping("register")
public class RegisterAction
{
	DBAction db=new DBAction();	
	@Autowired
	UserBean userbean;
	public UserBean getUserbean() {
		return userbean;
	}

	public void setUserbean(UserBean userbean) {
		this.userbean = userbean;
	}

@RequestMapping(method=RequestMethod.POST)
public ModelAndView RegisterAction(UserBean userbean)
{
	ModelAndView mandv=new ModelAndView();
	String username=userbean.getUsername().toString().trim();
	String password=userbean.getPassword().toString().trim();
	System.out.println(password);
	if(db.checkuser(username,password))
	{
		System.out.println("user exist");
		mandv.setViewName("login");
	}
	else
	{
		db.Register(username,password);
		System.out.println("register success");
		mandv.setViewName("login");
	}
	
	mandv.addObject("userbean",userbean);
	
	return mandv;
	
}  
}