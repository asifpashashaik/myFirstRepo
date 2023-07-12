package com.asif.java8Learning.Strings;

public class ReverseOfAString {

	public static void main(String[] args) {
		
		
		String s1 =new StringBuilder("Hello World").reverse().toString() ;
		System.out.println(s1);
		
		
		StringBuilder sb1 =new StringBuilder("Hello World").reverse() ;
		System.out.println(sb1);
		
		
		
	}

} 
