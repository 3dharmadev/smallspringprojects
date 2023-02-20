package com.Q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		 // ctx.refresh();
		Travel tr=ctx.getBean("travel",Travel.class);
		tr.show();
		
		

		
		 ctx.close();
 
	}

}
