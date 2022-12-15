package com.javatutorial;

import java.util.Scanner;

public class Armstrong {
	static int c,d,e;
	public static  void main(String[] arg){
	System.out.println("Enter the Number :");
	Scanner a = new Scanner(System.in);
	int b = a.nextInt();
	a.close();
	c=b;
	while(b>0){
	d=b%10;
	e=e+(d*d*d);
	b=b/10;
	}if(e==c){
	System.out.println(c+" Is a Armstrong Number");
	}else{
	System.out.println(c+" Is not a Armstrong Number");
	}
	}

}
