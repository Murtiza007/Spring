package main;

import org.springframework.context.ApplicationContext;
import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import Beans.User;
import resources.JavaCofiguration;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaCofiguration.class);
        JdbcTemplate jdbcTemplate=(JdbcTemplate)context.getBean(JdbcTemplate.class);
       
     
        ///insert 
       /* String username="basit";
        String password="basi1234";
        String email="moin@1234345";
      
        
        String insert_query="insert into users values(?,?,?)";
        
        int count=jdbcTemplate.update(insert_query,username,password,email);
        if(count>0) {
        	System.out.print("data inserted");
        }
        else {
        	System.out.print("data insertion failed");
        }
        
        
        //update
        
        
        String email="basit@123";
        String update_query="update users set email=? where username='basit' ";
        int count=jdbcTemplate.update(update_query,email);
        if(count>0) {
        	System.out.print("data updated");
        }
        else {
        	System.out.print("data updationtion failed");
        }
        */
        
        User users=new User();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter username to be deleted");
        users.setUsername(sc.next());
        
        String del_query="delete from users where username=?";
        int count=jdbcTemplate.update(del_query,users.getUsername());
        if(count>0) {
        	System.out.print("user deleted");
        }
        else {
        	System.out.print("deletion failed");
        }
        
    }
}
