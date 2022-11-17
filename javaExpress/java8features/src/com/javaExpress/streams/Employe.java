package com.javaExpress.streams;

public class Employe {
	String name;
	Integer salary;


	public Employe(String name, Integer salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	

	public String getName() {
		return name;
	}
	public Integer getSalary() {
		return salary;
	}
	
	
	@Override
	public String toString() {
		return "Employe [name=" + name + ", salary=" + salary + "]";
	}
	
}
