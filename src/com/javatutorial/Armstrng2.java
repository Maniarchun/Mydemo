package com.javatutorial;

public class Armstrng2 {

	public static void main(String[] arg) {
		for (int a = 100; a < 1000; a++) {
			int b, c, d =0;
			b=a;
			while (b > 0) {
				c = b % 10;
				d = d + (c * c * c);
				b = b / 10;
			}if(d==a) {
				System.out.println(d+" Is a Armstrong Number");
			}
		}
		
	}
}
