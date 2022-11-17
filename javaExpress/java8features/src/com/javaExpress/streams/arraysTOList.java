package com.javaExpress.streams;

import java.util.Arrays;
import java.util.List;

public class arraysTOList {
	public static void main(String[] args) {
		Integer[] li= {1,2,3,4,5,6,7};
		
		List<Integer>re=(List<Integer>) Arrays.stream(li);
	}
}
