package com.asif.java8Learning.Strings;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;

public class MaxOccurenceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="mouuuuuunikaaa";
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		for(char ch: str.toCharArray()) {
			if(!hashmap.containsKey(ch)) {
				hashmap.put(ch,1);
			}else {
				hashmap.put(ch, hashmap.get(ch)+1);
			}
		}
		char ch1=0;
		for(Entry<Character, Integer> ch:hashmap.entrySet()) {
			int max = 1;
			
			if(ch.getValue()>max) {
				max=ch.getValue();
				ch1=ch.getKey();
			}
		}
		
	
		
		//Using Streams
		System.out.println();
		Character character = hashmap.entrySet().stream().map(e->e.getKey()).max(Comparator.comparing(Character::valueOf)).get();
		System.out.println("character: " + character);
		
		Integer integer = hashmap.entrySet().stream().map(e->e.getValue()).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("integer: " + integer);
		
	}

//
// Output using streams:
//character: u
//integer: 6

	
	
}
