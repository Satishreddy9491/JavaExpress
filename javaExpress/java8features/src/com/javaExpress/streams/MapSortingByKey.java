package com.javaExpress.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class MapSortingByKey {
	public static void main(String[] args) {
		Map<String,Integer> item=new HashMap<>();
		item.put("Iphone", 56000);
		item.put("Normal phone",4300);
		item.put("Apple Tv",50000);
		item.put("Normal Tv", 23000);
		
		item.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEach(System.out::println);
		System.out.println();
		
		item.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}
}
