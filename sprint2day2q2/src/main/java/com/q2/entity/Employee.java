package com.q2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Employees",query = "from Employee")
@NamedNativeQuery(name="getNameSalary",query="SELECT name,salary FROM employee where empId=:id")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;
	@Column(nullable = false)
    private String name;
	@Column(nullable = false)
    private String address;
	@Column(nullable = false)
    private int salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
    
    
    
    
}
 