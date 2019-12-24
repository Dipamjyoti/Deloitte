package oops;

import java.util.StringTokenizer;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		String text = "The quick brown fox jumps over the lazy dog";
		StringTokenizer tokenizer = new StringTokenizer(text);
		System.out.println(tokenizer.countTokens());
		while(tokenizer.hasMoreTokens())
		{
			System.out.println(tokenizer.nextElement());
		}
	}

}
