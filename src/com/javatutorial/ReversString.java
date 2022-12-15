package com.javatutorial;

import java.util.Scanner;

public class ReversString {
	public static void main(String[] arg) {
		System.out.println("Enter the String");
		Scanner a = new Scanner(System.in);
		String b = a.next();
		a.close();
		String c = "";
		for (int i = b.length() - 1; i >= 0; i--) {
				c = c + b.charAt(i);
		}
		System.out.println(c);
		if(b.equals(c)) {
			System.out.println(c+" Is Palindrom");
		}else {
			System.out.println(c+" Is not a Palindrom");
		}
	}
}
