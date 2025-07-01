package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Beans.Employee;


public class Main {

	
public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Configuration/applicationContext.xml");
		
		Employee emp=(Employee) context.getBean("emp");
		emp.display();
		
	}
}
