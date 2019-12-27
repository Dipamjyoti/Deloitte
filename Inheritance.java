package oops;

abstract class Animal{
	public void sleep() {
		System.out.println("Animal Sleeps");
	}
	public abstract void eats();
}

class Dog extends Animal{
	public void eats() {
		System.out.println("Dog eats meat");
	}
}

class Cat extends Animal{
	public void eats() {
		System.out.println("Cat eats fish");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Animal a = new Dog();
		a.eats();
		a = new Cat();
		a.eats();
	}

}
