package Servlet;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dbmanagment.UsersEntity;

@Controller
@RequestMapping("/hello")
public class HelloWorld {
	@Autowired
private UsersEntity userbean;

@RequestMapping(method=RequestMethod.GET)
public ModelAndView sayHello(){
	UsersEntity userbean=new UsersEntity();
	ModelAndView mandv=new ModelAndView();
	mandv.addObject("userbean",userbean);
	mandv.setViewName("index");
	return mandv;
}
@RequestMapping("/world")
public String sayHello2(){
	return "welcome2";
}
@RequestMapping(method=RequestMethod.POST)
public ModelAndView sayHello4(UsersEntity bean){
	System.out.println("post method called.......");
	System.out.println(bean.getUsername()+" : "+bean.getPassword());
	ModelAndView mandv=new ModelAndView();
	mandv.addObject("userbean",bean);
	mandv.setViewName("welcome");
	return mandv;
}
@RequestMapping("/ubdemo")
public ModelAndView sayHello3(){
	userbean.setUsername("mano");
	userbean.setPassword("secret");
	ModelAndView mandv=new ModelAndView();
	mandv.setViewName("welcome");
	mandv.addObject("userbean",userbean);
	return mandv;
}
}
