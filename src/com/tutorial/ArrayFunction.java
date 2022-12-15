package com.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayFunction {
	public static void main(String[] args) {
		int a[] = { 1, 8, 4, 9, 5, 7, 4, 8, 4, 3, 1, 7 };
	
		
		Set<Integer> s = new TreeSet<>();

		boolean f = true;
		
		int temp;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
 				}
			}
			s.add(a[i]);
			System.out.println(a[i]);
		}
		
//		for (Integer in : s) {
//			System.out.println(in);
//		}
		}

	}


