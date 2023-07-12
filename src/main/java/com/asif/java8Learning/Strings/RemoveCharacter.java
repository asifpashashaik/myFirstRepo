package com.asif.java8Learning.Strings;
public class RemoveCharacter {
	
	public static void main(String args[]) {
		char ch='u';
		String str ="mounikaua";
		for(char ch1:str.toCharArray()) {
			if(ch==ch1) {
				str=str.replace(ch, ' ');
			}
		}
		System.out.println(str.trim().replace(" ", ""));
	}

}
