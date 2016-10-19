package dbmanagment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("invoice")
public class InvoiceController {

	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView execute1()
	{
		
		ModelAndView mdl=new ModelAndView();
		mdl.setViewName("welcome");
		
		return mdl;
	}
	
}
