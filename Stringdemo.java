package oops;

public class Stringdemo {
	public static void main(String[] args) {
		String s1 = "The quick brown fox jumps over the lazy dog";
		
		System.out.println("1. ");
		System.out.println(s1.charAt(12));
	
		if(s1.contains("is"))
			System.out.println("2. Contains is.");
		else
			System.out.println("2. Doesn't contain is.");
		
		String s2 = " and killed it.";
		s1 = s1.concat(s2);
		System.out.println("3. ");
		System.out.println(s1);
		
		if(s1.endsWith("dogs"))
			System.out.println("4. Ends with dogs");
		else
			System.out.println("4. Doesn't end with dogs");
		
		s2 = "The quick brown Fox jumps over the lazy Dog";
		if(s1.equals(s2))
			System.out.println("5. Equal");
		else
			System.out.println("5. Unequal");
		
		String s3 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		if(s1.equals(s3))
			System.out.println("6. Equal");
		else
			System.out.println("6. Unequal");
		
		System.out.println(s1.length());
		
		s1 = s1.replace("The", "A");
		System.out.println(s1);
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println;
	}
}
