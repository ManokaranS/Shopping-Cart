package customtag;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class InvoiceTag extends TagSupport{
	
@Override
public int doEndTag() throws JspException {
	JspWriter out=pageContext.getOut();
	HttpSession session=pageContext.getSession();

	 Enumeration<String> e=session.getAttributeNames();
	 
	 while(e.hasMoreElements())
	 {
		 String name=e.nextElement().toString();
		 String value=session.getAttribute(name).toString();

		 if(name.startsWith("c"))
			try {
				out.println(name+" : "+value);
			} catch (IOException e1) {
			System.out.println("Error "+e);
			}
}
	return 1;
}
}
