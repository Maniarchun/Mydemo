package com.javatutorial;


public class Prime_Number {
	public static void main(String[] args) {
//		int c = 0;
//		for (int n = 1000; n <= 10000; n++) {
		int n =8253;
			boolean f = true;
			for (int i = 2; i < n/2; i++) {
				if (n % i == 0) {
					f = false;
				}
			}
			if (f == true) {
				System.out.println(n + " Is Prime Number");
				//c++;
			}else {
				System.out.println(n+" Is not a Prime Number");
			}
//		}
//		System.out.println("Total Prime Number is : "+c);
	}

}
