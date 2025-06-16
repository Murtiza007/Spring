package springJAVAconfig.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springJAVAconfig.Students;
import springJAVAconfig.resources.JavaConfigFile;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfigFile.class);
		
		Students std=(Students) context.getBean("std");
		std.display();
		
		Students std1=(Students) context.getBean("std1");
		std1.display();
		
		
	}
	
	
}
