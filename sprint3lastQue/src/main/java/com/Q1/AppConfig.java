package com.Q1;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.Q1")
public class AppConfig {
	
	@Bean
	public List<String> getCities(){
		List<String> cities=Arrays.asList("puri","mumbai","delhi","coimbatore","lajpatnagar");
		return cities;
	}
	
	
	@Bean
	public List<Student> getStudents(){
		List<Student> students=Arrays.asList(
				new Student(1, "anit", "XI"),
				new Student(2, "mlch", "I"),
				new Student(3, "kachra", "II"),
				new Student(4, "jhatua", "III"),
				new Student(5, "dustbean", "I")
				);
		return students;
	}
	
 

}
