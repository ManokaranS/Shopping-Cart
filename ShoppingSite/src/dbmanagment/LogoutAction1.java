package dbmanagment;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sun.javafx.sg.prism.NGShape.Mode;

@Controller
@RequestMapping("logout")
public class LogoutAction1{
	DBAction dba=new DBAction();
	@Autowired
	LangBean lbean;
	
	public LangBean getLbean() {
		return lbean;
	}

	public void setLbean(LangBean lbean) {
		this.lbean = lbean;
	}

	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView execute(HttpSession session) {
		ModelAndView mandv=new ModelAndView();
		System.out.println("logout");
		String uname=session.getAttribute("username").toString();
		System.out.println("logout 1");
	     if(uname!=null)
	     {
			dba.changestatus(uname,0);
			System.out.println("Status change success logout success");
			session.invalidate();
			mandv.setViewName("language");
			mandv.addObject("lbean",lbean);
	     }
			return mandv;
	}
}
