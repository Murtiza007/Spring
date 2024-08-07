package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.users;

public class Main {

	public static void main(String[] args){
	
	String config_loc="/in/sp/resources/applicationContext.xml";
	ApplicationContext context=new ClassPathXmlApplicationContext(config_loc);
	
	//users u =new users();
	//u.display();
	
	users u = (users) context.getBean("usrBean");
	u.display();
	System.out.println("---------------------");
	users u2 = (users) context.getBean("usrBean2");
	u2.display();
	}
}
