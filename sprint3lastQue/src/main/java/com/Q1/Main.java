package com.Q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctxApplicationContext= new AnnotationConfigApplicationContext(AppConfig.class);
		
		  Demo demo=ctxApplicationContext.getBean("demo",Demo.class);
	     demo.getDetails();
	     
	     
	}

}
