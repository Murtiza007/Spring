package main;

import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import Beans.User;
import resources.JavaCofiguration;
import Mapper.UserMapper;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaCofiguration.class);
        JdbcTemplate jdbcTemplate=(JdbcTemplate)context.getBean(JdbcTemplate.class);
       
     
        /*///insert 
        String username="habib";
        String password="bazil234";
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
        
        /*
        String email="basit@123";
        String update_query="update users set email=? where username='basit' ";
        int count=jdbcTemplate.update(update_query,email);
        if(count>0) {
        	System.out.print("data updated");
        }
        else {
        	System.out.print("data updationtion failed");
        }
        
        
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
        */
        
        
        //select all
        
       
       String select_query="select * from users";
       List<User> User=jdbcTemplate.query(select_query, new UserMapper());
       
       for(User user: User) {
    	   
    	   System.out.println("user :"+user.getUsername());
    	   System.out.println("password: "+user.getPassword());
    	   System.out.println("email: "+user.getEmail());
    	   System.out.println("---------------------------");
    	    
       }
       
       //select one
       String name="momin";
       String select_quer="select * from users where username =?";
       User user=jdbcTemplate.queryForObject(select_quer, new UserMapper(),name);
       
      
    	   
    	   System.out.println("user :"+user.getUsername());
    	   System.out.println("password: "+user.getPassword());
    	   System.out.println("email: "+user.getEmail());
    	   System.out.println("---------------------------");
    }
    
    
}
