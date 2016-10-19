package dbmanagment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import JdbcOperation.JDBCUtility;
@Controller
@RequestMapping("loginpage")
public class LoginAction
{   
	
	@Autowired
	UserBean userbean;
	public UserBean getUserbean() {
		return userbean;
	}

	public void setUserbean(UserBean userbean) {
		this.userbean = userbean;
	}
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView getmethod()
	{
		UserBean userbean=new UserBean();
		ModelAndView mandv=new ModelAndView();
		mandv.setViewName("login");
		mandv.addObject("userbean",userbean);
		return mandv;
	}
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView execute(UserBean userbean,HttpSession session)
	{
		ModelAndView mandv=new ModelAndView();
		DBAction dba=new DBAction();
				
			String username=userbean.getUsername().toString().trim();
			String password=userbean.getPassword().toString().trim();
			System.out.println("hi check user");
				if(dba.checkuser(username,password))
					{
					
						if(dba.checkstatus(username))
							{
							dba.changestatus(username, 1);
							session.setAttribute("username",username);
							mandv.setViewName("welcome");
							}
						else
							{
						System.out.println("Login Already Login.AlreadyLogin");
						session.setAttribute("username",username);
						mandv.setViewName("welcome");
							}
					}
				else
				{
					System.out.println("hi i am here");
					session.setAttribute("username",username);
					mandv.setViewName("Register");
				}
	mandv.addObject("userbean",userbean);
	return mandv;

}
}
