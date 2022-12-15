package com.javatutorial;

import java.util.Scanner;

public class ReversNumber {
	public static void main(String[] arg){
		System.out.println("Enter The Number");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		a.close();
		int c,d=0;
		while(b>0){
		c=b%10;
		d=d*10+c;
		b=b/10;
		}
		System.out.println(d);
		}
}
