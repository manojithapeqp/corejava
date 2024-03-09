package com.qppractice;

public class CompleteTrangle {

	public static void main(String[] args) {
		int n = 6;
		int i, j;
		// print number of rows
		for (i = 1; i <= n; i++) {
			// To print space
			for (j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			//inner loop to print star 
			for (j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
