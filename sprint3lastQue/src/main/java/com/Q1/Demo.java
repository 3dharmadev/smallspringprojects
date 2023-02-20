package com.Q1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
@Lazy
public class Demo {
	
	 @Autowired
	 List<String> cities; // read the 5 cities name from the properties file and 
     //inject it into his List.
	  @Autowired
      List<Student> students; // 5 student details (hard-coded details) Make sure to
//demonstrate the init and destroy the life cycle method also.
	
      
      public void getDetails() {
		 
    	System.out.println(cities);
    	 System.out.println(students);
	}
	

}
