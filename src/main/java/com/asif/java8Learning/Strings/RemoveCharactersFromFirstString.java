package com.asif.java8Learning.Strings;
public class RemoveCharactersFromFirstString {

	public static void main(String[] args) {
		String str1="amu";
		String str2="mounikaa";
		for(char ch:str1.toCharArray()){
			if(str2.contains(Character.toString(ch))) {
				str2=str2.replace(Character.toString(ch), "");
			}
		}
		System.out.println(str2);
	}

}
