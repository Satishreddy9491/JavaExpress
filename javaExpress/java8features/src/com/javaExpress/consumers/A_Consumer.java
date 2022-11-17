package com.javaExpress.consumers;

import java.util.function.Consumer;

public class A_Consumer {
	public static void main(String[] args) {
		Consumer<String> c=s ->System.out.println();
		c.accept("saf");
		c.accept("hgjhd");
	}
}
