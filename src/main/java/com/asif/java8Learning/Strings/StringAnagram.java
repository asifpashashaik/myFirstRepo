package com.asif.java8Learning.Strings;
import java.util.HashSet;
import java.util.Set;

public class StringAnagram {

	public static void main(String[] args) {
		/*An anagram contains are of the same length and contains the same character, but in a different order, 
		 * for example, "Army" and "Mary" is the anagram. Your program should return true if both Strings are the anagram, false otherwise*/
		
		String str1="yaqrmy";
		String str2="mqaryy";
		Set<Character> strings1 = new HashSet<Character>();
		Set<Character> strings2 = new HashSet<Character>();
		if(str1.length()==str2.length()) {
			for(char ch: str1.toCharArray()) {
				strings1.add(ch);
			}
			for(char ch: str2.toCharArray()) {
				strings2.add(ch);
			}
			System.out.println(strings1);
			System.out.println(strings2);
			if(strings1.containsAll(strings2) && strings2.containsAll(strings1)) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not anagram");
			}
		}else {
			System.out.println("Not anagram");
		}
	}

}
