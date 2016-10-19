package dbmanagment;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CheckNumberProg extends TagSupport{
private String number;
@Override
	public int doEndTag() throws JspException {
		int n=Integer.parseInt(number);
		JspWriter out =pageContext.getOut();
		if(n%2==0){
			try{
			out.println("even number");
			}catch(Exception e){}
		}else
		{
			try{
				out.println("odd number");
				}catch(Exception e){}
		}
		return super.doEndTag();
	}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
}
