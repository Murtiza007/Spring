package springXMLconfig.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springXMLconfig.Students;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/springXMLconfig/resources/applicationContext.xml");
		
		Students std=(Students) context.getBean("std");
		std.display();
		
		Students std1=(Students) context.getBean("std1");
		std1.display();
	}
	
	
}
