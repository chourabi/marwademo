package com.example.employeesg.request;

public class AddEmployeeRequest {

	private String email;
	private String name;
	private Long id_department;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId_department() {
		return id_department;
	}
	public void setId_department(Long id_department) {
		this.id_department = id_department;
	}
	public AddEmployeeRequest(String email, String name, Long id_department) {
		super();
		this.email = email;
		this.name = name;
		this.id_department = id_department;
	}
	public AddEmployeeRequest() {
		super();
	}
	
	
	
	
	
}
