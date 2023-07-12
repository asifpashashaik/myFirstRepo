package com.asif.java8Learning.Strings.JavaConceptPrograms;


public class Inheritenace {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//super class object
		superclass superclass = new superclass();
		superclass.test();
		
		System.out.println("-----------------");
		//sub class object
		subclass subclass = new subclass();
		subclass.test();
		
		System.out.println("-----------------");
		superclass s = new subclass();
		s.test();
		
		//Con't convert from super class to subclass
		//subclass s1 = new superclass();
		//s1.test();

	}
}

class superclass{
	void test() {
		System.out.println("super class test method");
	}
}

class subclass extends superclass{
	void test() {
		System.out.println("sub class test method");
		super.test();
	}
	
}
