package com.javaExpress.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Product1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer productId;
	 
	 private String productName;
	 
	 private  Double price;
	 
	 private String productDescription;
	 
	 @CreationTimestamp
	 private Date createdTime;
	 
	 @UpdateTimestamp
	 private Date updatedTime;
	 
	 public Product1() {
		 
	 }

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
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

	public Product1(Integer productId, String productName, Double price, String productDescription, Date createdTime,
			Date updatedTime) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.productDescription = productDescription;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
	}

}
