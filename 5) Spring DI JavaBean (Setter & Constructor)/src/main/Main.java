package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Beans.Car;
import Beans.Lenovo;
import resources.SpringConfiguration;


public class Main {

public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
//		
//		Lenovo lenovo=(Lenovo)context.getBean("LenObj");
//		lenovo.display();
//		
//		Lenovo lenovo1=(Lenovo)context.getBean("LenObj1");
//		lenovo1.display();
//		
		Car c1=(Car)context.getBean("car1");
		c1.display();
		
		Car c2=(Car)context.getBean("car2");
		c2.display();
	
}
}