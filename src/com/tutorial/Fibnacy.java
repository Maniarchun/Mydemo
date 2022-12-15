package com.tutorial;

public class Fibnacy {
	public static void main(String[] arg) {
	int a=0;
	int b=1;
	int c;
	System.out.println(a);
	System.out.println(b);
	for(int i=0;i<8;i++){
	c=a+b;
	System.out.println(c);
	a=b;
	b=c;
	}
	}

}
