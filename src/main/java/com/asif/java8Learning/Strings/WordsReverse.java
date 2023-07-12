
package com.asif.java8Learning.Strings;
import java.util.Scanner;

public class WordsReverse {

	public static void main(String[] args) {
		System.out.println("Enter any sentence");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String rev="";
		for(String str1:str.split(" ")) {
			rev = rev+" "+reverse(str1);
		}
		System.out.println(rev.trim());
	}
	private static String reverse(String str) {
		String rev="";
		for(char ch:str.toCharArray()) {
			rev=ch+rev;
		}
		return rev;
		
	}

}
