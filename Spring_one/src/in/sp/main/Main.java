package in.sp.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.users;

import org.springframework.context.ApplicationContext;
public class Main {

	public static void main(String[] args) {
		
	String config_loc="/in/sp/resources/applicationContext.xml";
	ApplicationContext context=new ClassPathXmlApplicationContext(config_loc);
	
	users u=(users) context.getBean("usrBean");
	u.display();
	users u2=(users) context.getBean("usrBean2");
	u2.display();
	
	}
}
