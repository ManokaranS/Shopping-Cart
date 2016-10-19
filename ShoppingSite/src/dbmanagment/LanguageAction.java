package dbmanagment;

import java.util.Locale;
import java.util.ResourceBundle;
import org.springframework.web.servlet.ModelAndView;

import dbmanagment.UserBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.mbeans.UserMBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("indexpage")
public class LanguageAction 
{
	@Autowired
	LangBean lbean;
	UserBean userbean;
	public LangBean getLbean() {
		return lbean;
	}

	public void setLbean(LangBean lbean) {
		this.lbean = lbean;
	}
	public UserBean getUserbean() {
		return userbean;
	}

	public void setUserbean(UserBean userbean) {
		this.userbean = userbean;
	}
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView execute1() {
		LangBean lbean=new LangBean();
		ModelAndView mandv=new ModelAndView();
		mandv.setViewName("language");
		mandv.addObject("lbean",lbean);
		System.out.println("hi hi hi");
		return mandv;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView execute2(HttpSession session,LangBean lbean)
	{
		System.out.println("hello hello");
		UserBean userbean=new UserBean();
		ModelAndView mandv=new ModelAndView(); 
		String lang=lbean.getLang();
		ResourceBundle rb=ResourceBundle.getBundle("dictionary",new Locale(lang));
		session.setAttribute("rb",rb);
		mandv.addObject("userbean",userbean);
		mandv.setViewName("login");
		System.out.println("h1");
		return mandv;		
	}
}
