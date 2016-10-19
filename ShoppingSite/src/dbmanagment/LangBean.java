package dbmanagment;

import org.springframework.stereotype.Component;


@Component
public class LangBean {
private String lang;

public String getLang() {
	return lang;
}
public void setLang(String lang) {
	this.lang = lang;
}
}
