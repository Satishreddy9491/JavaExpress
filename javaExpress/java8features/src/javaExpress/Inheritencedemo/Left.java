package javaExpress.Inheritencedemo;

public interface Left {
	default void m1() {
		System.out.println("Left m1");
	}
}
