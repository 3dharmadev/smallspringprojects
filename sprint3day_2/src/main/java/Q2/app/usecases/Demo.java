package Q2.app.usecases;

import java.util.Map;

import Q2.app.model.Department;
import Q2.app.model.Employee;

public class Demo {
	
	private Map<Department, Employee> theMap;
	//use setter injection to inject theMap;
	
	
	

	public void myInit(){
		System.out.println("inside myInit method");
	}

	public void setTheMap(Map<Department, Employee> theMap) {
		this.theMap = theMap;
	}

	public void cleanUp(){
		System.out.println("inside cleanUp method");
	}

	public void showDetails(){
		System.out.println("inside showDetails of Demo class");
		//print all the details of all the employees department-wise.
		theMap.forEach((dept,emp)->System.out.println(dept+" "+emp));
	}

}
