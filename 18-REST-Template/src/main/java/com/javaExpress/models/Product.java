package com.javaExpress.models;

import java.util.Date;

public class Product {
	
	
	private Integer id;
	
	
	private String name;
	
	private Double price;
	
	 private String description;
	
	private boolean active;
	
	private Date createdTime;
	
	private Date updatedTime;
	
	private Categeroy categeroy;

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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public Categeroy getCategeroy() {
		return categeroy;
	}

	public void setCategeroy(Categeroy categeroy) {
		this.categeroy = categeroy;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", active=" + active + ", createdTime=" + createdTime + ", updatedTime=" + updatedTime
				+ ", categeroy=" + categeroy + "]";
	}
	
	
}
