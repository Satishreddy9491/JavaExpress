package com.javaExpress.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Autowired
	
	private Address address;
	

	public void displayAddress() {
		System.out.println("DisplayAddress address	method is excecuted");
		String location = address.getLocation(); 
		System.out.println("My location is "+location);
	}
}
