package oops;

public class Demo {
	int num1=500;
	int num2=900;
	int age = 5;
	public Demo() {
		int age = 50;
		num1++;
		num2=++num1;
		System.out.println(age);
	}
	public Demo(int num2, Demo demo) {
		num2=++this.num1;
		this.num1=--demo.num2;
		this.num2=num2++;
		demo.num1=++num2;
	}
	public static void main(String[] args) {
		int num1=8,num2=16;
		Demo d1= new Demo();
		Demo d2 = new Demo(num2,d1);
		System.out.println(d1.num1+d2.num2+num1);
		System.out.println(d1.num1+d2.num2+num2);
	}
}
