package com.javaExpress.models;

import org.springframework.stereotype.Component;

@Component
public class Address {
 	public Address() {
		System.out.println("Address Constrctor");
	}

	public String getLocation() {
		return "Hyderbad";
	}
	
}
