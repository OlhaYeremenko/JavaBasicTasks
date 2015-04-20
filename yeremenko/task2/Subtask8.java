package com.epam.at.yeremenko.task2;

public class Subtask8 {
	public static void t8(int N, String str) {
		int[][] matrix =new int[N][N];
		int k;
		switch (str) {
		case "l":
			 k= 1;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					matrix[i][j] = k;
					k++;
				}
			}
			Subtask9.printMatrix(matrix);
			break;

		case "t":			
			 k = 1;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					matrix[j][i] = k;
					k++;
				}
			}
			Subtask9.printMatrix(matrix);
			break;
		}

	}

}
