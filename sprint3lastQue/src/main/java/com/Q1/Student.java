package com.Q1;

public class Student {

	
	private int id;
	private String name;
	private String standard;
	public Student(int id, String name, String standard) {
		super();
		this.id = id;
		this.name = name;
		this.standard = standard;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", standard=" + standard + "]";
	}
	
	
}
