package com.asif.java8Learning.Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		String str="mmounikaao";
		HashMap<Character, Integer> hashMap = new LinkedHashMap<Character, Integer>();
		for(char ch: str.toCharArray()) {
			if(!hashMap.containsKey(ch)) {
				hashMap.put(ch,1);
			}else {
				hashMap.put(ch,hashMap.get(ch)+1);
			}
		}
		System.out.println(hashMap);
		/*for(Entry<Character, Integer> ch:uniqueChar.entrySet()) {
			if(ch.getValue()==1) {
				System.out.println(ch.getKey());
				break;
			}
		}*/
		for(char ch: hashMap.keySet()) {
			if(hashMap.get(ch)==1) {
				System.out.println(ch);
				break;
			}
		}
		

		
		
		

	}

}
