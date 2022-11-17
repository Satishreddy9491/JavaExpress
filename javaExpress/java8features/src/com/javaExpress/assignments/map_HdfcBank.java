package com.javaExpress.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class map_HdfcBank {
	public static void main(String[] args) {
		
		List<HdfcBank> li=new ArrayList<>();
		li.add(new HdfcBank("Satish", 5678,9000));
		li.add(new HdfcBank("Reddy", 98765,870));
		li.add(new HdfcBank("Sidda", 123,879));
		li.add(new HdfcBank("murthi", 9876,980));
		
		List<String> result = li.stream().map(HdfcBank::getName).collect(Collectors.toList());
		System.out.println(result);
	}
	

}
