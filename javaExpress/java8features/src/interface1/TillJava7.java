package interface1;

interface B{
	static final String DB_USERNAME="root";
	public abstract void m1();
	
		
	}


public class TillJava7 implements B{
	public static void main(String[] args) {
		B obj=new TillJava7();
		obj.m1();
	}

	@Override
	public void m1() {
		System.out.println("M1 method is executed");
		
	}
}

