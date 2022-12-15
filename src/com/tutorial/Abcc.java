package com.tutorial;

public class Abcc implements Abcb,Abca {
	

	@Override
	public void mai() {
		System.out.println("mai");
	}

	@Override
	public void mai(int a) {
		System.out.println(a);		
	}

	@Override
	public void ma() {
		System.out.println("ma");		
	}

	@Override
	public void mm() {
		System.out.println("mm");		
	}
	public static void main(String[] args) {
		Abcc a = new Abcc();
		a.ma();a.mai();a.mai(1);a.mm();a.aa();a.bb();
	}

	@Override
	public void aa() {
		System.out.println("aa");
	}

	@Override
	public void bb() {
		System.out.println("bb");
	}
	
	
	
	
}
