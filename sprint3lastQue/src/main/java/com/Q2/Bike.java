package com.Q2;


public class Bike implements Vehicle {

	public void bikeDefin() {
		System.out.println("bike has 2 wheels etc.");
	}

	@Override
	public void selfStory() {
		bikeDefin();
	}
	
	
	
}
