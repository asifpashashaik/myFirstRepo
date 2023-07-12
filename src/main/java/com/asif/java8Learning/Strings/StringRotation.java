package com.asif.java8Learning.Strings;
import java.util.ArrayList;
import java.util.List;

public class StringRotation {

	public static void main(String[] args) {
		String str="abcdef";
		int rotationNum=3;
		String rotatedString=str;
		for(int i=0;i<rotationNum;i++) {
			rotatedString=rotation(rotatedString);
		}
	System.out.println(rotatedString);
	}
	private static String rotation(String str) {
		char chr[] = str.toCharArray();
		for(int i=1;i<chr.length;i++) {
			if(i==chr.length-1) {
				char temp = chr[i-1];
			      chr[i-1] = chr[0];
			      chr[0] = temp;
			}else {
				char temp = chr[i-1];
			      chr[i-1] = chr[i+1];
			      chr[i+1] = temp;
			}
			
		}
		String string = new String(chr);  
		return string;
	}
}
