package com.Q2;



public class Car  implements Vehicle{

	
	public void carDefination() {
		System.out.println("car has 4 wheels etc.");
	}

	@Override
	public void selfStory() {
		carDefination();
	}
}
