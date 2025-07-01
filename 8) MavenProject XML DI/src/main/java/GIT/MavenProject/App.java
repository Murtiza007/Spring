package GIT.MavenProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Beans.Employee;



public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("/resources/applicationContext.xml");
        
        Employee emp= (Employee) context.getBean("emp1");
        emp.display();
        
      
    }
}
