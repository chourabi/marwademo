package com.example.employeesg.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departments")

public class Department {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private long id;
	 
	 
	 @Column(name = "fullname", nullable = false)
	 private String name;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Department(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public Department() {
		super();
	}
	 
	 
	 

}
