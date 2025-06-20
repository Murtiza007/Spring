package resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Beans.Car;
import Beans.Engine;
import Beans.Intel;
import Beans.Lenovo;

@Configuration
public class SpringConfiguration {

	@Bean
	public Intel intObj() {
		
		Intel intel =new Intel();
		intel.setThreads("i5");
		intel.setClockspeed("2.5Ghz");
		intel.setGeneartion("13th");
		
		return intel;

	}
	
	@Bean
	public Lenovo LenObj() {
		
		Lenovo lenovo =new Lenovo();
		lenovo.setModel("ThinkBook");
		lenovo.setPrice("30,000");
		
		//dependency injected
		lenovo.setIntel(intObj());
		
		return lenovo;

	}
	
	
	@Bean
	public Intel intObj1() {
		
		Intel intel =new Intel();
		intel.setThreads("i7");
		intel.setClockspeed("2.5Ghz");
		intel.setGeneartion("11th");
		
		return intel;

	}
	
	@Bean
	public Lenovo LenObj1() {
		
		Lenovo lenovo =new Lenovo();
		lenovo.setModel("YOGABook");
		lenovo.setPrice("50,000");
		
		//dependency injected
		lenovo.setIntel(intObj1());
		
		return lenovo;

	}
	
	@Bean
	public Engine eng1() {
		
		Engine eng=new Engine("3","900","Deisel");
		return eng;
		
	}
	@Bean
	public Car car1() {
		
		Car car=new Car("Swift","9L",eng1());
		return car;
		
	}
	
	
	@Bean
	public Engine eng2() {
		
		Engine eng=new Engine("4","1200","Deisel");
		return eng;
		
	}
	@Bean
	public Car car2() {
		
		Car car=new Car("Scorio","12L",eng2());
		return car;
		
	}
	
	
	
	
}
