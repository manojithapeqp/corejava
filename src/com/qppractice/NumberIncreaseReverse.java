package com.qppractice;

public class NumberIncreaseReverse {

	public static void main(String[] args) {
		
		int i, j;
		// print number of rows
		for (i = 5; i >=1; i--) {
			// inner loop to print star
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		

	}

}


