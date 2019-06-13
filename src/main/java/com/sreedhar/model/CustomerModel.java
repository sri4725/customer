package com.sreedhar.model;

public class CustomerModel {
	private int id;
	private String name;
	private String Email;
	private String description;
	
	public CustomerModel(int id, String name, String Email, String description) {
		this.id=id;
		this.name=name;
		this.Email=Email;
		this.description=description;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
