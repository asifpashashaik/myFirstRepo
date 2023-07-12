package com.asif.java8Learning.Strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TofindCounOfCharUsingMap {

	private static final Collectors Collecters = null;

	public static void main(String[] args) {

		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		// Eg1
		String s = "Hello World";
		for (char c : s.toCharArray()) { 
			System.out.println("Selected First Char :" + c);
			System.out.println("(This checks wheather its presnt in hashmap or not)hashMap.get: " + hashMap.get(c));
			if (hashMap.get(c) != null) {
				hashMap.put(c, hashMap.get(c) + 1);
			} else {
				hashMap.put(c, 1);
			}

		}

		System.out.println(hashMap);
		
		System.out.println("____________________________________________________");
		System.out.println("____________________Very Simple Way_____________________");
		
		String s1 = "Hello World";
		char[] charArray = s1.toCharArray();
		
         List<char[]> count = Stream.of(charArray).map(e->e).collect(Collecters.toList());
         System.out.println(count);
	}

}
