package com.javaExpress.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer id;
	
	@Column(name="email")
	private String emailId;
	
	private String password;
	
	private String phone;
}
