package com.javaExpress.lambdas;
@FunctionalInterface  //inside the interface you can define only one abstract method and any number of default methods and static method is known as functional interface

interface B{
	void m1();
}
public class A {
	public static void main(String[] args) {
		B obj=()->{
			System.out.println("M1 method executed");
		};
		
		obj.m1();
	}
}
