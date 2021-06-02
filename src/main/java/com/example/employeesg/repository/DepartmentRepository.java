package com.example.employeesg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeesg.entitys.Department;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
