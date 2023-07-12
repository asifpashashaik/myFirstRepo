package com.asif.java8Learning.Strings;
import java.util.Scanner;

public class MatirxAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size1=1, size2=2;
		int[][] a = new int[size1][size2];
		int[][] b = new int[size1][size2];
		int[][] sum = new int[size1][size2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array1 elements");
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		
		System.out.println("Sum of arrays");
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				System.out.print(sum[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}


	}

}
