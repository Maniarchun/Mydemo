package com.javatutorial;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeat_Word {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		String s = "for The people by the People of the people";
		String s1 = s.toLowerCase();
		String[] allWorrd = s1.split(" ");
		for (String word : allWorrd) {
			if(m.containsKey(word)) {
				Integer value = m.get(word);
				m.put(word, value+1);
			}else {
				m.put(word, 1);
			}
		}
		Set<Entry<String, Integer>> allEntry = m.entrySet();
		for (Entry<String, Integer> entry : allEntry) {
			if(entry.getValue()>1) {
				System.out.println(entry);
			}
		}
	}
}
