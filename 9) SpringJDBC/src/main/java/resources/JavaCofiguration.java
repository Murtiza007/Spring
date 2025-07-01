package resources;

import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import Beans.User;

@Configuration
public class JavaCofiguration {
	
	//a--- jdbc template
	//b---- drivermanager data source

	@Bean
	public DriverManagerDataSource myDataSource() {
		
		try {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springdemo2");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		return dataSource;
		}
		catch(Exception ex){
			System.out.print(ex);
		}
		
		return null;
	}
	
	@Bean
	public JdbcTemplate myJdbcTemplate() {
		JdbcTemplate jdbcTemplate =new JdbcTemplate();
		jdbcTemplate.setDataSource(myDataSource());
		return jdbcTemplate;
		
	}
	
	
	
}
