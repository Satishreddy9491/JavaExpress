package com.javaExpress.models;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private Address address=new Address();
	

	public Employee(Address address) {
		System.out.println("Employee Constrctur is here");
		this.address = address;
	}



	public void displayAddress() {
		System.out.println("DisplayAddress address	method is excecuted");
		String location = address.getLocation(); 
		System.out.println("My location is "+location);
	}
}
