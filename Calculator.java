package oops;

public class Calculator {
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static double add(double a, double b) {
		return a+b;
	}
	
	public static double add(int a, double b) {
		return a+b;
	}

	public static double add(double a, int b) {
		return a+b;
	}
	
	public static int diff(int a, int b) {
		return a-b;
	}
	
	public static double diff(double a, double b) {
		return a-b;
	}
	
	public static double diff(int a, double b) {
		return a-b;
	}

	public static double diff(double a, int b) {
		return a-b;
	}
	
	public static int mul(int a, int b) {
		return a*b;
	}
	
	public static double mul(double a, double b) {
		return a*b;
	}
	
	public static double mul(int a, double b) {
		return a*b;
	}

	public static double mul(double a, int b) {
		return a*b;
	}
	
	public static int div(int a, int b) {
		return a/b;
	}
	
	public static double div(double a, double b) {
		return a/b;
	}
	
	public static double div(int a, double b) {
		return a/b;
	}

	public static double div(double a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		int a = 10 , b = 20;
		double c = 10.5 , d = 20.5;
		
		System.out.println("Add:");
		System.out.println(add(a,b));
		System.out.println(add(b,c));
		System.out.println(add(c,b));
		System.out.println(add(c,d));
		System.out.println(""
				+ "");
		
		System.out.println("Diff:");
		System.out.println(diff(a,b));
		System.out.println(diff(b,c));
		System.out.println(diff(c,b));
		System.out.println(diff(c,d));
		System.out.println(""
				+ "");
		
		System.out.println("Mul:");
		System.out.println(mul(a,b));
		System.out.println(mul(b,c));
		System.out.println(mul(c,b));
		System.out.println(mul(c,d));
		System.out.println(""
				+ "");
		
		System.out.println("Div:");
		System.out.println(div(a,b));
		System.out.println(div(b,c));
		System.out.println(div(c,b));
		System.out.println(div(c,d));
		
	}

}
