package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Beans.Student;
import resources.SpringConfiguration;



public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
	
		
		Student std1=(Student) context.getBean("std2");
		std1.display();
		
		Student std2=(Student) context.getBean("std1");
		std2.display();
		
		
	}
	
	
}
