package com.asif.java8Learning.Generics.Examples;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;

@Getter
@Setter
@Log
public class GenericClass1<T> {

	//Generic with setter and getter example
	//Making Class and methods generic
	
	//T is a type parameter
	private T data;
	
	
	@Override
	public String toString() {
		return "Data entered is :" + data ;
	}
	
	public GenericClass1(T data) {
	this.data = data; 	
	}
	
	
	public static void main(String[] args) {
		
		GenericClass1<String> stringType = new GenericClass1("Asif");
		GenericClass1<Integer> integerType = new GenericClass1(10);
		GenericClass1<Double> doubleType = new GenericClass1(10.10);
	
		
		// as type is T it automatically detects its type
        log.info("GenericClass1 entered is :" + new GenericClass1("Asif"));
        log.info("GenericClass1 entered is :" + new GenericClass1(10));
        log.info("GenericClass1 entered is :" + new GenericClass1(10.10));
        
        
     
     
     
     
     
     
	}



}
