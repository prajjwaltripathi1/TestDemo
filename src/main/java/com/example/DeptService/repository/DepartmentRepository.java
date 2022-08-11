package com.example.DeptService.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DeptService.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {



	Department save(Department department);

	Department findByDepartmentId(Long departmentId);

}
