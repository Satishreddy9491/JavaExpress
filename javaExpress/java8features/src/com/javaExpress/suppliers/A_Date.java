package com.javaExpress.suppliers;


import java.util.Date;
import java.util.function.Supplier;

public class A_Date {
	public static void main(String[] args) {
		Supplier<Date> s=()->new Date();
		System.out.println(s.get());
	}
}
