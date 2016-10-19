package dbmanagment;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("shopping")
public class ShopAction{

	@Autowired
	UserBean userbean;
	
	public UserBean getUserbean() {
		return userbean;
	}

	public void setUserbean(UserBean userbean) {
		this.userbean = userbean;
	}
	
	@Autowired
	ProductBean pbean;

	public ProductBean getPbean() {
		return pbean;
	}

	public void setPbean(ProductBean pbean) {
		this.pbean = pbean;
	}

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView moveShoppingPage()
	{
		
		ModelAndView mdl=new ModelAndView();
		ProductBean pbean=new ProductBean();
		mdl.setViewName("shop1");
		mdl.addObject("pbean",pbean);
		
		return mdl;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView shoppingproduct(ProductBean pbean,HttpSession session)
	{
		ModelAndView mdl=new ModelAndView();
		
	
		
		if(pbean.getP1()!=null)session.setAttribute(pbean.getP1(),pbean.getP1());
		if(pbean.getP2()!=null)session.setAttribute(pbean.getP2(),pbean.getP2());
		if(pbean.getP3()!=null)session.setAttribute(pbean.getP3(),pbean.getP3());
		
		
		mdl.addObject("pbean",pbean);
		mdl.setViewName(pbean.getPage());
		
		
		return mdl;
		
	}
	
	
}
