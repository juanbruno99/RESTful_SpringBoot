package com.example.domain;

public class Customer {
	//Constructors
	public Customer() {}
	
	public Customer(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//Properties
	private Long id;
	private String name;
	
	//Accessors
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
