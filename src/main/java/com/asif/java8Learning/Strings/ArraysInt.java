package com.asif.java8Learning.Strings;
public class ArraysInt {

	static int[] array;
	static int[] lastDigits;
	static int[] firstDigits;
	public static void main(String[] args) {
		array = new int[]{405, 415, 443, 43};
		lastDigits = new int[array.length];
		firstDigits = new int[array.length];
		FirstAndlastDigits(array);
		FirstDigits(array);
		int sum=compareDigits(firstDigits,lastDigits);
		System.out.println(sum);
	}
	public static int compareDigits(int[] firstDigits, int[] lastDigits){
		int sum=0;
		for(int i=0; i<firstDigits.length;i++){
			for(int j=i+1; j<lastDigits.length;j++){
				if(firstDigits[i]==firstDigits[j] && lastDigits[i]==lastDigits[j]){
					if(sum<array[i]+array[j]) {
						sum=array[i]+array[j];
					}
				}
			}
		}
		return sum;
	}

	public static void FirstAndlastDigits(int[] array){
		for(int i=0; i<array.length;i++){
			lastDigits[i]=array[i]%10;
		}
	}
	public static void FirstDigits(int[] array){
		for(int i=0; i<array.length;i++){
			int j=array[i];
			while(j>=10){
				j=j/10;
			}
			firstDigits[i]=j;
		}
	}
}
