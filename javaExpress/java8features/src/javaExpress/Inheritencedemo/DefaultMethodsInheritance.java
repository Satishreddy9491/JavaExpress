package javaExpress.Inheritencedemo;

public class DefaultMethodsInheritance implements Left,Right {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Left.super.m1();
	}
	
	/*
	  @Override public void m1() { // TODO Auto-generated method stub
	  Right.super.m1(); }
	 */
	public static void main(String[] args) {
		Left obj=new DefaultMethodsInheritance();
		obj.m1();
	}
}
