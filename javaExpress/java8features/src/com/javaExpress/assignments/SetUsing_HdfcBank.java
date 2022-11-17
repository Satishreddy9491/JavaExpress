package com.javaExpress.assignments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SetUsing_HdfcBank {
	public static void main(String[] args) {
		List<HdfcBank> li=new ArrayList<>();
		li.add(new HdfcBank("Satish", 5678,9000));
		li.add(new HdfcBank("Reddy", 98765,870));
		li.add(new HdfcBank("Sidda", 123,879));
		li.add(new HdfcBank("murthi", 9876,980));
		
		Set<HdfcBank> result = li.stream().filter(bank ->bank.getBalance()<900).collect(Collectors.toSet());
		System.out.println(result);
		System.out.println();
		
		
		
	Map<Integer, String> result1 = li.stream().collect(Collectors.toMap(HdfcBank::getBalance,HdfcBank::getName));
	System.out.println(result1);
	}
}
