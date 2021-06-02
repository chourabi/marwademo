package com.example.employeesg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeesg.entitys.Employee;

public interface EmployeesRepository extends JpaRepository<Employee,Long> {

}
