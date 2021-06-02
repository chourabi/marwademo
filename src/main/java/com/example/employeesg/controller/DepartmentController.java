package com.example.employeesg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeesg.entitys.Department;
import com.example.employeesg.entitys.Employee;
import com.example.employeesg.repository.DepartmentRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/departement") 
@RestController()
public class DepartmentController {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@GetMapping("/list")
	public List<Department> getDepartments(){
		return this.departmentRepository.findAll();
	}
	
	@PostMapping("/add")
	public Department addNewDepartment(@RequestBody Department d) {
		
		return this.departmentRepository.save(d);
	}
	

}
