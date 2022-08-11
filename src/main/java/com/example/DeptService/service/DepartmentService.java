package com.example.DeptService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DeptService.entity.Department;
import com.example.DeptService.repository.DepartmentRepository;

@Service
public class DepartmentService {
  
	@Autowired
	private DepartmentRepository departmentRepository;
	

	public Department findDepartmentById(Long departmentId) {

		return departmentRepository.findByDepartmentId(departmentId);
	}

	public Department save(Department department) {
		
		return departmentRepository.save(department); 
	}
}
