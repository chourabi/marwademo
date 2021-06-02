package com.example.employeesg.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeesg.entitys.Employee;
import com.example.employeesg.repository.DepartmentRepository;
import com.example.employeesg.repository.EmployeesRepository;
import com.example.employeesg.request.AddEmployeeRequest;


@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/employee") 
@RestController()
public class EmployeesController {
	
	@Autowired
	EmployeesRepository employeesRepository;
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@GetMapping("/list")
	public List<Employee> getEmployees(){
		
		
		
		return this.employeesRepository.findAll();
	}
	
	
	@GetMapping("/list/{id}")
	public Employee getEmployee(@PathVariable() long id){
		return this.employeesRepository.findById(id).get();
	}
	
	@GetMapping("/delete/{id}")
	public void delete(@PathVariable() long id){
		Employee e =  this.employeesRepository.findById(id).get();
		this.employeesRepository.delete(e);
		
	}
	
	
	
	@PostMapping("/add")
	public Employee addNewEmployee(@RequestBody AddEmployeeRequest er) {
		Employee e = new Employee();
		e.setEmail(er.getEmail());
		e.setFullname(er.getName());
		e.setDepartment( this.departmentRepository.findById(er.getId_department()).get() );
		
		return this.employeesRepository.save(e);
	}
	
	
	@PostMapping("/update/{id}")
	public Employee editEmployee(@RequestBody Employee e,@PathVariable() long id) {
		Employee search = this.employeesRepository.findById(id).get();
		search.setEmail(e.getEmail());
		search.setFullname(e.getFullname());
		
		return this.employeesRepository.save(search);
	}
	
	
	
	
	
	
	
	
	
	
}
