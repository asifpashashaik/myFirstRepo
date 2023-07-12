package com.asif.java8Learning.Strings.JavaConceptPrograms;

public class StaticKeyword {

	static int a=10;
	public static void main(String[] args) {
		//Memory benefit because no need to create object for it. We can call variables or methods using class name.
		StaticKeyword.display(20);
	}
	
	static void display(int a) {
		System.out.println(a);
	}
}
