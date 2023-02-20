package com.q2.dao;

import java.util.List;

import com.q2.entity.Employee;
import com.q2.exception.EmployeeException;
import com.q2.util.EMUtility;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
		EntityManager em=EMUtility.getManager();
         Query q = em.createNamedQuery("Employees");
		
		 List<Employee> emps=q.getResultList();
		  em.close();
		 if(emps.isEmpty()) throw new EmployeeException("ZERO EMPLOYEE EXISTS...");
		  else return emps;
	}

	@Override
	public List<Employee> getEmployeesByAddress(String address) throws EmployeeException {
		// TODO Auto-generated method stub
		EntityManager em=EMUtility.getManager();
		String jpql="from Employee where address=:adrs";
		    Query q=em.createQuery(jpql);
		    q.setParameter("adrs", address);
		    
		   List<Employee> empsEmployees= q.getResultList();
		   em.close();
		   if(empsEmployees.isEmpty()) throw new EmployeeException("No employee exists from "+address);
		   
		return empsEmployees;
	}

	@Override
	public List<Employee> getAllEmployeeWithRangeSalary(int startSalary, int endSalary) throws EmployeeException {
		
		EntityManager em=EMUtility.getManager();
		 List<Employee> list=null;
		try {
		String jpql="from Employee where salary BETWEEN :START AND :END";
		    Query q=em.createQuery(jpql);
		    q.setParameter("START", startSalary);
		    q.setParameter("END",endSalary);
		    
		    list= q.getResultList();
		   em.close();
		}
		catch(Exception e) {
		  throw new EmployeeException("No employee exists with this details...");
		}
		return list;
	}

	@Override
	public Object[] getEmployeeNameAndSalary(int empId) throws EmployeeException {
		EntityManager em=EMUtility.getManager();
		Object[] objlist= null;
		try {
 
		   
		   TypedQuery<Object[]> tq= em.createNamedQuery("getNameSalary", Object[].class);
			
		    tq.setParameter("id", empId);
		    
		    
		     objlist= tq.getSingleResult();
		}
		catch(Exception e) {
			 throw new EmployeeException("No employee exists with this id...");	
		}
		finally{
			em.close();
		}
		 
		return objlist;
	}

	@Override
	public int getEmployeeSalaryById(int empId) throws EmployeeException {
		 
		EntityManager em=EMUtility.getManager();
		Integer sal=null;
		try {
		String jpql="select salary from Employee where empId=:id";
		    Query q=em.createQuery(jpql);
		    q.setParameter("id", empId);
		    TypedQuery<Integer> tq=em.createQuery(jpql, Integer.class);
		     
		    sal= (Integer) q.getSingleResult();
		}
		catch(Exception e) {
		  throw new EmployeeException("No employee exists with this ID...");
		}
		return sal;
		
		
		
	}
   
}
