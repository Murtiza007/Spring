package resources;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Beans.Address;
import Beans.Student;

@Configuration
public class SpringConfiguration {
	
	@Bean
	public Address addr1() {
		
		Address addr=new Address();
		addr.setHouseNo("3");
		addr.setLane("1");
		addr.setPin("190010");
		return addr;
		
	}
	
	@Bean
	public Student std1() {
		Student std=new Student();
		std.setName("moin");
		std.setId(101);
		return std;
		
	}
	
	
	@Bean
	public Address addr2() {
		
		Address addr=new Address();
		addr.setHouseNo("100");
		addr.setLane("1");
		addr.setPin("190010");
		
		return addr;
		
	}
	@Bean
	public Student std2() {
		Student std=new Student();
		std.setName("moin");
		std.setId(101);
		std.setAddress(addr2());
		
		return std;
		
	}

}
