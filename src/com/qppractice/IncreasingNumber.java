package com.qppractice;

public class IncreasingNumber {

	public static void main(String[] args) {
		int n = 6;
		int i, j;
		// print number of rows
		for (i = 1; i <= n; i++) {
			// To print space
			for (j = 1; j <= n - i; j++) {
			}
			// inner loop to print star
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
