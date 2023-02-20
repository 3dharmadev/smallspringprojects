package com.masai.useCase;

import java.util.Map;

import com.masai.model.Department;
import com.masai.model.Employee;

public class Demo {
	private Map<Department, Employee> theMap;

	public void myInit() {
		System.out.println("inside myInit method");
	}

	public void setTheMap(Map<Department, Employee> theMap) {
		this.theMap = theMap;
	}

	public void cleanUp() {
		System.out.println("inside cleanUp method");
	}

	public void showDetails() {
		System.out.println("inside showDetails of Demo class");
		theMap.forEach((department, employee) -> System.out.println(department+" "+employee));
	}
}
