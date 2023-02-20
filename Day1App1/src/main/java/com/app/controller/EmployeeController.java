package com.app.controller;

import java.util.ArrayList;
import java.util.List;

 
import jakarta.annotation.PostConstruct;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;

@RestController
public class EmployeeController {
	
	List<Employee> employees=new ArrayList<>();

	@PostConstruct
	public void init() {

		employees.add(new Employee(1,"deba","18181818","snsna@gmail.com",120000));
		employees.add(new Employee(2,"rama","10109229","dbsata@gmail.com",193982));
		employees.add(new Employee(3,"shyama","18181818","dkdkd@gmail.com",192982));
	}

	@PostMapping("/employee")
	public  String saveEmployee(@RequestBody Employee employee) {

		employees.add(employee);

		return "successfully added";
	}


	@GetMapping("/employees")
	public List<Employee> getEmployees() {


		return  employees;

	}
	
	@PutMapping("/employee/{id}")
	public String updateSalary(@PathVariable("id") Integer id) {
		
		boolean flag=false;
		
	for (Employee employee : employees) {
		if(employee.getEmpId()==id) {
			flag=true;
			employee.setSalary(employee.getSalary()+1000);
		}
		
	}
	if(flag) return "success";
	else  return "wrong id";
	}
	
	@PutMapping("/increaseby10percent")
	public String updateSalaryBy10Percent() {
		
		boolean flag=false;
		
	for (Employee employee : employees) {
		flag=true;
			employee.setSalary(employee.getSalary()/100*10+employee.getSalary());
		
	}
	if(flag) return "updated successfully";
	else  return "something went wrong";
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteById(@PathVariable("id") Integer id) {
		
		boolean flag=false;
		
		
		for (int i=0;i<employees.size();i++) {
			if(employees.get(i).getEmpId()==id) {
				flag=true;
				employees.remove(i);
			}
			
		}
		if(flag) return "successfully deleted";
		else  return "wrong id";
	}

	
	
	
	


}
