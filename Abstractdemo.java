package oops1;

abstract class Animal{
	public abstract void roam();
	public abstract void eat();
	public abstract void makeNoise();
	public void sleep() {
		System.out.println("Animal Sleeps");
	}	
}

abstract class Feline extends Animal{
	public void roam() {
		System.out.println("Feline roam");
	}
}

class Lion extends Feline{
	public void makeNoise() {
		System.out.println("Lion make noise");
	}
	public void eat() {
		System.out.println("Lion eat");
	}
}

class Tiger extends Feline{
	public void makeNoise() {
		System.out.println("Tiger make noise");
	}
	public void eat() {
		System.out.println("Tiger eat");
	}
}

class Cat extends Feline{
	public void makeNoise() {
		System.out.println("Cat make noise");
	}
	public void eat() {
		System.out.println("Cat eat");
	}
}

class Hippo extends Animal{
	public void roam() {
		System.out.println("Hippo roam");
	}
	public void makeNoise() {
		System.out.println("Hippo make noise");
	}
	public void eat() {
		System.out.println("Hippo eat");
	}
}

abstract class Canine extends Animal{
	public void roam() {
		System.out.println("Canine roam");
	}
}

class Dog extends Canine{
	public void makeNoise() {
		System.out.println("Dog make noise");
	}
	public void eat() {
		System.out.println("Dog eat");
	}
}

class Wolf extends Canine{
	public void makeNoise() {
		System.out.println("Wolf make noise");
	}
	public void eat() {
		System.out.println("Wolf eat");
	}
}

public class Abstractdemo {

	public static void main(String[] args) {
		Animal a = new Lion();
		a.roam();
		a.eat();
		a.makeNoise();
		a = new Tiger();
		a.roam();
		a.eat();
		a.makeNoise();
		a = new Cat();
		a.roam();
		a.eat();
		a.makeNoise();
		a = new Hippo();
		a.roam();
		a.eat();
		a.makeNoise();
		a = new Dog();
		a.roam();
		a.eat();
		a.makeNoise();
		a = new Wolf();
		a.roam();
		a.eat();
		a.makeNoise();
	}

}
