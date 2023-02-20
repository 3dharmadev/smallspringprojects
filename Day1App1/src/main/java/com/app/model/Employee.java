package com.app.model;

public class Employee {

    private int empId;
    private String empName;
    private String  mob;
    private String    email;
    private int  salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(int empId, String empName, String mob, String email, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.mob = mob;
        this.email = email;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", mob='" + mob + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
