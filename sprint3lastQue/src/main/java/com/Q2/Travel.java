package com.Q2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//@Scope(value="singleton")  	@PreDestroy works only with singleton 
public class Travel {
	
	
	@Autowired
	Vehicle vehicle;
	
	
	@PostConstruct
	public void setUp() {
		System.out.println("inside set up method");
	}
	
	@PreDestroy
	public void tearDown(){
		System.out.println("inside tear down method");
	}

	
	public void show() {
		System.out.println("I am telling my story");
		vehicle.selfStory();
	}
	

}
