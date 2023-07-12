package com.asif.java8Learning.Strings;

import lombok.extern.java.Log;


@Log
public class StringsAndItsMethods {

	public static void main(String[] args) {

    //String - replaceFirst,replaceAll,replace
	log.info("John is 111 years old, and Mary is 20 years old ".replaceFirst("\\d\\d", "")); //replaces only first matching digit using regularExpression
	log.info("John is 10 years old, and Mary is 20 years old".replaceAll("\\d\\d", "30"));  
	log.info("John like to learn code".replace("to learn", ""));
	
	
	//StringBuilder - delete,replace
	log.info(new StringBuilder("Java is language or programming language").delete(7, 19).toString());
	log.info(new StringBuilder("Java is Code").replace(8, 12, "Programming language").toString());    
		
	}

}
