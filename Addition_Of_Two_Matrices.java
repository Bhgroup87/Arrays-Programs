package com.java.program;

import java.util.Scanner;

import com.java.program.exception.RowColumnMismatchedException;

public class Addition_Of_Two_Matrices {

	public static int checkRowColumn(int r, int c) {
		if (r == c) {
			return 1;
		}
		return 0;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Rows:  ");
		int row = sc.nextInt();
		System.out.println("Enter No of Columns:  ");
		int col = sc.nextInt();

		int check = checkRowColumn(row, col);
		if (check == 1) {

		} else {
			System.out.print("\033[H\033[2J");
			System.out.flush();
			new RowColumnMismatchedException("Row and column of Matrix should be same!");
		}

		int[][] arr = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}