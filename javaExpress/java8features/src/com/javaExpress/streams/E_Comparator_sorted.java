package com.javaExpress.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class E_Comparator_sorted {
	public static void main(String[] args) {
		ArrayList<String>s=new ArrayList<String>();
		s.add("Java");
		s.add("python");
		s.add("aws");
		s.add("Php");
		s.add("C++");
		s.add("Kotlin");
		
		List<String> result = s.stream().map(a->a.toUpperCase()).sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("Assending order");
		System.out.println(result);
		
		
		List<String> result1 = s.stream().map(a->a.toUpperCase()).sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println("Dessending order");
		System.out.println(result1);
		
		
	}
}
