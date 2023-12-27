package com.javaExpress.models;

import java.util.HashSet;
import java.util.Set;

public class Categeroy {

	private Integer id;

	private String name;
	
	Set<Product> products = new HashSet<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Categeroy [id=" + id + ", name=" + name + ", products=" + products + "]";
	}
	
	
	
	
}
