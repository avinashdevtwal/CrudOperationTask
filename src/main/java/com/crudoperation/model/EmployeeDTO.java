package com.crudoperation.model;

public class EmployeeDTO {
	private Long id; 
	private String Firstname; 
	private String Lastname; 
	private String Email; 
	private int Age ;
	public EmployeeDTO(Long id, String firstname, String lastname, String email, int age) {
		super();
		this.id = id;
		Firstname = firstname;
		Lastname = lastname;
		Email = email;
		Age = age;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public EmployeeDTO() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", Email=" + Email
				+ ", Age=" + Age + "]";
	}
	
}
