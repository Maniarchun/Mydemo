package com.tutorial;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class RemoveDuplicate {
	static  ArrayList<Integer> allValue = new ArrayList<>();
	static TreeSet<Integer> allValueSet = new TreeSet<>();
	public static void enterValue() {
		System.out.println("enter the value");
		Scanner s = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			int value = s.nextInt();
			allValue.add(value);
		}
		s.close();
		System.out.println(allValue);
	}
	public static void removeDuplicateInbuild() {
		for (Integer value : allValue) {
			allValueSet.add(value);
		}
		System.out.println(allValueSet);
	}
	public  static void removeDuplicateWithoutInbuid() {
		for (int i = 0; i < allValue.size(); i++) {
			for (int j = i+1; j < allValue.size(); j++) {
				if (allValue.get(i).equals(allValue.get(j))) {
					allValue.remove(j);
					j--;
				}
			}
		}
		System.out.println(allValue);
	}

	public static void main(String[] args) {
		enterValue();
		removeDuplicateInbuild();
		removeDuplicateWithoutInbuid();
	}
}