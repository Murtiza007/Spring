package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import SpringAnnotationConfiguration.Employees;
import SpringAnnotationConfiguration.Students;
import resources.JavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] Args) {
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("/resources/applicationContext.xml");
//		Employees emp=(Employees) context.getBean("employees");
//		emp.display();
		
		ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
		Students std=(Students) context.getBean("students");
		std.display();
	}
}
