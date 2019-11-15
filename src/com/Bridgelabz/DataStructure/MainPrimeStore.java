package com.Bridgelabz.DataStructure;

import java.util.Scanner;

import com.Bridgelabz.program.utility.InputScanner;

public class MainPrimeStore {

	public static void main(String[] args) {
		DprimeNUmber obj = new DprimeNUmber();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of rows");
		int row = InputScanner.intScanner();
		System.out.println("enter the no of columns");
		int col = InputScanner.intScanner();

		int[][] a = new int[row][col];
		int[] b = new int[row * col];
		int i = 0, j;
		int k = 1;
		while (i < row * col) {
			if (obj.checkPrime() == true) {
				b[i] = k;
				i++;
			}
			k++;
		}
		int c = 0;
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				b[c] = a[i][j];
				c++;
			}
		}
		System.out.println("the final array is:");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
