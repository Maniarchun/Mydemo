package com.javatutorial;

public class Constructor {
	public Constructor(int a) {
		this(3,5);   // this keyword should be use in the stating of the Constructor Block 
		System.out.println(a);
		
	}public Constructor(int b, int c) { // It accept the method overloading 
		System.out.println(b);
		System.out.println(c);
	}
	public Constructor() {
		this(1);
		int a = 12;
		System.out.println(a);
	}
public static void main(String[] args) {
	Constructor m = new Constructor(); // we can create only object, we dont need to call a method
	
}
}
