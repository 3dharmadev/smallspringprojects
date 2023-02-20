package com.q2.dao;
 
import java.util.List;

import com.q2.entity.*;
import com.q2.exception.EmployeeException;

public interface EmployeeDao {
	   public List<Employee> getAllEmployees() throws EmployeeException;
	   //getAllEmployees implement using NamedQuery

		public List<Employee> getEmployeesByAddress(String address) throws EmployeeException;

		public List<Employee> getAllEmployeeWithRangeSalary(int startSalary, int endSalary) throws EmployeeException;
		
		public Object[] getEmployeeNameAndSalary(int empId)throws EmployeeException;
    	//getEmployeeNameAndSalary implement using namedNativeQuery
 
		public int getEmployeeSalaryById(int empId)throws EmployeeException;
}
