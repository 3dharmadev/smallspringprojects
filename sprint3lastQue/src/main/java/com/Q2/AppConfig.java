package com.Q2;

 

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.Q2")
public class AppConfig {
	
	 @Bean
	public Vehicle getObj() {
		Vehicle vehicle= new  Bike();
		
		return vehicle;
	}
	 
	 
	 
 

}
