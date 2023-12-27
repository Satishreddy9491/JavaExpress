package com.javaExpress.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private Address address=new Address();
	
	@Autowired
	public void setAddress(Address address) {
		System.out.println("setAddress method is excecuted");
		this.address = address;
	}
	public Employee() {
		System.out.println("Employee Constructor");
	}
	public void displayAddress() {
		System.out.println("DisplayAddress address	method is excecuted");
		String location = address.getLocation(); 
		System.out.println("My location is "+location);
	}
}
