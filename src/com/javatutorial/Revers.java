package com.javatutorial;

import java.util.Scanner;

public class Revers {
	static int c,d;
public static void main(String[] args) {
	System.out.println("Enter the String");
	Scanner s =new Scanner(System.in);
	String a = s.nextLine();
	s.close();
	String b="";
	for(int i = a.length()-1;i>=0;i--) {
		b=b+a.charAt(i);
	}
	System.out.println("Revers Char : "+b);
	String e[]=a.split(" ");
	System.out.println("Revers Word :");
	for (int i = e.length-1;i>=0;i--) {
		System.out.print(e[i]+" ");
	}
	
}
}
