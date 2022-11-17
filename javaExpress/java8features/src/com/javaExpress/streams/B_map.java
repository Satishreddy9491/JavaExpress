package com.javaExpress.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class B_map {
	

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		a.add("Satish");
		a.add("Reddy");
		a.add("sidda");
		a.add("venkata");
		
		List<String> result= a.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(result);
	}
}
