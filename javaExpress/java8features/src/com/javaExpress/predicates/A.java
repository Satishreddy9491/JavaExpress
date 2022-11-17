package com.javaExpress.predicates;

import java.util.function.Predicate;


// Write a predicate to check whether the given integer is equal to 2020 or not
//Write a predicate to check whether the length of the	given string is greater then the 5 or not


public class A {
	public static boolean checkNumber(int num) {
		return num==2020;
	}
	public static void main(String[] args) {
//		System.out.println(checkNumber(8787));
//		System.out.println(checkNumber(2020));
		
		
		// now use predicate function
		
		Predicate<Integer> p=(num)-> num==2020;
		System.out.println(p.test(20202));
		System.out.println(p.test(2020));
		
		
//Write a predicate to check whether the length of the	given string is greater then the 5 or not
		
		System.out.println("given string is greater then the 5 or not");
		Predicate<String> p1=s -> s.length()>5;
		System.out.println(p1.test("JavaExpress"));
		System.out.println(p1.test("Satish reddy"));
		System.out.println(p1.test("Sati"));
		
		
	}
	
	
	
	
}
