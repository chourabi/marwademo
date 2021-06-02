package com.example.employeesg.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "employees")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","department"})
public class Employee {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private long id;
	 
	 @Column(name = "fullname", nullable = false)
	 private String fullname;
	 
	 @Column(name = "email", nullable = false)
	 private String email;
	 

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departments_id")
	private Department department;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Employee(long id, String fullname, String email, Department department) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.department = department;
	}


	public Employee() {
		super();
	}
    
    
    
	 
	 

}
