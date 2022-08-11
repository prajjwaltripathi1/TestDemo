package com.example.DeptService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.DeptService.entity.Department;
import com.example.DeptService.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.save(department);
		
	}
	
	@GetMapping("departments/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
		return departmentService.findDepartmentById(departmentId);
		
	}

}
