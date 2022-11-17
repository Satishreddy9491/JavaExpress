package com.javaExpress.bank;

//In this interface is know the "WHY  WE NEED THE DEFAULT METHODS"

interface IBank {
	void withdraw();
	void deposit();
	
	
	
	// Before java 8
	//void loan();  //whenever i am using the loan it will effect the all child class "but i want give loan in only one bank is asked 
	
	
	//Before java 8
	
	default void loan() {  //when you have use default keyword then not effect the other subclass
		System.out.println("you can override the loan funactinality in your child class");
	}
}
