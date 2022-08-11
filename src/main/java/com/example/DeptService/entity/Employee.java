package com.example.DeptService.entity;

import javax.persistence.Entity;

@Entity
public class Employee {
	
	private String employeeName;
	private double employeeSalary;
	private String employeeGender;
	private int employeeAge;
	
	public Employee(String employeeName, double employeeSalary, String employeeGender, int employeeAge) {
		super();
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeGender = employeeGender;
		this.employeeAge = employeeAge;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	
	
	
}	
	