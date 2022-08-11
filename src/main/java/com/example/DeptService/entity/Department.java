package com.example.DeptService.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Department {
	
	@Id
	@GeneratedValue
	private int departmentId;
	private String departmentName;
    private int  NumberOfEmployee;
    
	public Department(int departmentId, String departmentName, int numberOfEmployee) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		NumberOfEmployee = numberOfEmployee;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getNumberOfEmployee() {
		return NumberOfEmployee;
	}

	public void setNumberOfEmployee(int numberOfEmployee) {
		NumberOfEmployee = numberOfEmployee;
	}
    
	
    
    
}
