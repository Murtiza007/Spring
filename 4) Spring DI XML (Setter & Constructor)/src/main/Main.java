package main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import BeanClasses.Employee;
import BeanClasses.Student;



public class Main {

public static void main(String[] args) {
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("/resources/applicationContext.xml");
//		
//		Employee emp= (Employee)context.getBean("emp");
//		emp.display();
	
		ApplicationContext context=new ClassPathXmlApplicationContext("/resources/applicationContext2.xml");
//	
		Student std= (Student)context.getBean("std2");
		std.display();

		Student std1= (Student)context.getBean("std");
		std1.display();
	
	}
	
}

