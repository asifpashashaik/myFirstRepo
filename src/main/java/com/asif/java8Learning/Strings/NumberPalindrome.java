package com.asif.java8Learning.Strings;

import java.util.Scanner;

public class NumberPalindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int n=121;
		int rev=0, temp;
		for(int i=n; i>0;i=i/10) {
			temp=i%10;
			rev=(rev*10)+temp;
		}
		System.out.println(rev);
		if(n==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String:");
		String next = scanner.next();
		String reverse = new StringBuilder(next).reverse().toString();
		System.out.println(next  +  "," +  reverse);
		
		if(next.equals(reverse)) {
			System.out.println("Palindrome");
			}else {
				System.out.println("Not Palindrome");
			}
		
		
	}

}
