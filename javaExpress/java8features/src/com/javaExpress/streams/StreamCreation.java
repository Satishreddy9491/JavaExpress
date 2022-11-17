package com.javaExpress.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreation {
	public static void main(String[] args) {
		String[] str=new String[] {"satish","jagan","sirisha","bhaskar"};
		
		Stream<String> result = Arrays.stream(str);
		List<String> collect = result.sorted().collect(Collectors.toList());
		System.out.println(collect);
		
	}
	
	
}

