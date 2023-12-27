package com.javaExpress.models;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Products")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor


public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(length = 100,nullable = false)
	@Size(min=3,max=100,message="product name atlest 3 numbers")
	private String name;
	
	@Min(value=1,message="price should be greater than zero")
	private Double price;
	
	private boolean active;
	
	@CreationTimestamp
	private Date createdTime;
	
	@UpdateTimestamp
	private Date updatedTime;
	
	@ManyToOne
	@JoinColumn(name="categeroy_id",nullable = false)
	private Categeroy categeroy;
}
