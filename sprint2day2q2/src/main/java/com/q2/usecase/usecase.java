package com.q2.usecase;

import java.util.List;

import com.q2.dao.EmployeeDao;
import com.q2.dao.EmployeeDaoImpl;
import com.q2.entity.Employee;
import com.q2.exception.EmployeeException;

public class usecase {
	
	public static void main(String[] args) {
 	/*  EntityManager em=EMUtility.getManager();
 
		  Employee employee=new Employee(); employee.setAddress("MAHARASTRA"); employee.setName("KUNAL"); employee.setSalary(120323);
		  
		  Employee employee1=new Employee(); employee1.setAddress("MAHARASTRA"); employee1.setName("TEJAS"); employee1.setSalary(85000);
		  
		  
		  Employee employee2=new Employee(); employee2.setAddress("JARKHAND"); employee2.setName("AMARDEEP"); employee2.setSalary(123000);
		  
		  em.getTransaction().begin();
		  em.persist(employee2);
		  em.persist(employee);
		  em.persist(employee1);
		  em.getTransaction().commit();
		  
		  em.close(); */
		  
		  EmployeeDao dao=new EmployeeDaoImpl();
		  
		  
	    /*
	   try {
		List<Employee> emps = dao.getAllEmployees();
		
		for (Employee employee : emps) {
			System.out.println(employee);
		}
	} catch (EmployeeException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage()); 
	}*/
		  
		  
		  
	/* try {
		List<Employee> emps= dao.getEmployeesByAddress("JARKHAND");
		for (Employee employee : emps) {
			System.out.println(employee);
		}
	} catch (EmployeeException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	} */
		  
		  
		/*  try {
			System.out.println(dao.getAllEmployeeWithRangeSalary(122222,1522000));
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		  
		/*  try {
			 
			Object[] objl=dao.getEmployeeNameAndSalary(1);
			System.out.println(objl[0]); 			System.out.println(objl[1]);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		  
		  
		  try {
			System.out.println(dao.getEmployeeSalaryById(152));
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		  
		  
		  
		  
		  
	}

}
