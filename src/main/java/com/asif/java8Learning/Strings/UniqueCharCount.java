package com.asif.java8Learning.Strings;
import java.util.HashMap;

public class UniqueCharCount {

	public static void main(String[] args) {
		String str="mounikaa";
		HashMap<Character, Integer> charcount = new HashMap<Character, Integer>();
		for(char ch: str.toCharArray()) {
			if(!charcount.containsKey(ch)) {
				charcount.put(ch, 1);
			}else {
				charcount.put(ch, charcount.get(ch)+1);
			}
		}
		int count=0;
		for(char ch: charcount.keySet()) {
			if(charcount.get(ch)==1) {
				count++;
			}
		}
		System.out.println(count);
	}

}
