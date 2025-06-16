package springJAVAconfig.resources;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springJAVAconfig.Students;

@Configuration
public class JavaConfigFile {
	@Bean
	public Students std() {
		
		Students std=new Students();
		std.setRoll_no(5);
		std.setName("Ahmad");
		std.setAddress("hawal");
		
		return std;
		
	}
	
	
	
	@Bean
	public Students std1() {
		
		Students std=new Students();
		std.setRoll_no(6);
		std.setName("Ahsan");
		std.setAddress("hawal");
		
		return std;
		
	}
	
	
}
