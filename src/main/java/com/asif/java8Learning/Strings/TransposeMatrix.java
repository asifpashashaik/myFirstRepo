package com.asif.java8Learning.Strings;
import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int row=sc.nextInt();
		int column = sc.nextInt();
		int[][] matrix =  new int[row][column];
		System.out.println("Enter array elements");
		for(int i=0;i<row;i++) {
			for(int j=0; j<column;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0; j<column;j++) {
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		int[][] matrixT =  new int[column][row];
		for(int i=0;i<column;i++) {
			for(int j=0; j<row;j++) {
				matrixT[i][j]=matrix[j][i];
			}
		}
		
		for(int i=0;i<column;i++) {
			for(int j=0; j<row;j++) {
				System.out.print(matrixT[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
