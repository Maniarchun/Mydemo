package com.tutorial;


import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Abc {
	
	public static void main(String[] args) {
		
		Map<String, Integer> m = new HashMap<>();
		String s = "for the people by the people of the people";
		String[] allWord = s.split(" ");
		for (String word : allWord) {
			m.put(word, 1);
	
		}
		System.out.println(m);
		Set<Entry<String,Integer>> entrySet = m.entrySet();
		System.out.println(entrySet);
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
	}

}
