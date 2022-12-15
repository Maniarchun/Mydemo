package com.javatutorial;

public class Sample {
	static int a;
	public void mani() {
		int a=1;
		System.out.println(a);
	}
	public static void main(String[] args) {
		System.out.println(a);
		Sample m = new Sample();
		m.mani();
	}
}
