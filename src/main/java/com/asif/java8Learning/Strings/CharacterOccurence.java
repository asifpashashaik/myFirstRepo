package com.asif.java8Learning.Strings;
import java.util.HashMap;

public class CharacterOccurence {

	public static void main(String[] args) {
		String str="mounikaa";
		HashMap<Character, Integer> hashMap = new HashMap<Character,Integer>();
		for(char ch: str.toCharArray()) {
			if(!hashMap.containsKey(ch)) {            //if(hashMap.get(ch) == null) {
				hashMap.put(ch, 1);
			}else {
				hashMap.put(ch, hashMap.get(ch)+1);
			}
		}
		System.out.println(hashMap);
	}

}
