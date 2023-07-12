package com.asif.java8Learning.Generics.Examples;

import lombok.extern.java.Log;

interface GenericInterface<T> {
	public void dataMethod(T data);
}

//Generic with Interface Example 2
//here we have generic - interface, class, method and fields

@Log
public class GenericClass2<T> implements GenericInterface<T> {

	@Override
	public void dataMethod(T data) {
		log.info("Entered data is : " + data);
	}

	public static void main(String[] args) {

		GenericClass2 o1 = new GenericClass2();
		o1.dataMethod("String");
		o1.dataMethod(10);
		o1.dataMethod(10.11);
	
	}

}
