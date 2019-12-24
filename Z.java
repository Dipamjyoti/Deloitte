package oops;

public class Z {
	W w=new W();
	{
		System.out.println("Instance Block");
	}
	static {
		System.out.println("Static Block");
	}
	
	public Z() {
		System.out.println("Z constructor called");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Block");
		new Z();
		new Z();
	}
}
