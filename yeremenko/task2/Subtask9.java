package com.epam.at.yeremenko.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Subtask9 {
	public static int[][] inputMatrix() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] array = new int[n][n];

		Random random = new Random();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = random.nextInt(50);
			}
		}
		in.close();
		return array;
	}

	public static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + "\t");
			}
			System.out.println();
		}

	}

	public static void sortMatrixsRows(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			Arrays.sort(matrix[i]);
		}
	}

	public static void t92r(int[][] matrix, int k) {
		final int N = matrix.length;
		int[][] tmp = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int rowIndex = (i * N + j + k) / N;
				int colIndex = (i * N + j + k) % N;
				tmp[rowIndex % N][colIndex] = matrix[i][j];
			}
		}

		for (int i = 0; i < N; i++) {
			matrix[i] = Arrays.copyOf(tmp[i], N);
		}
	}

	public static void t92l(int[][] matrix, int k) {
		final int N = matrix.length;
		int[][] tmp = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int rowIndex = i * N + j - k;
				if (rowIndex < 0) {
					rowIndex += N * N;
				}
				rowIndex /= N;

				int colIndex = (i * N + j - k);
				if (colIndex < 0) {
					colIndex += N;
				}
				colIndex %= N;
				tmp[rowIndex % N][colIndex] = matrix[i][j];
			}
		}

		for (int i = 0; i < N; i++) {
			matrix[i] = Arrays.copyOf(tmp[i], N);
		}
	}

	public static void t92t(int[][] matrix, int k) {
		final int N = matrix.length;
		int[][] tmp = new int[N][N];

		for (int i = 0; i < N; i++) {
			tmp[i] = Arrays.copyOf(matrix[(i + k) % N], N);
		}

		for (int i = 0; i < N; i++) {
			matrix[i] = Arrays.copyOf(tmp[i], N);
		}
	}

	public static void t92b(int[][] matrix, int k) {
		final int N = matrix.length;
		int[][] tmp = new int[N][N];

		for (int i = 0; i < N; i++) {
			int rowIndex = i - k;
			if (rowIndex < 0) {
				rowIndex += N;
			}
			tmp[i] = Arrays.copyOf(matrix[rowIndex], N);
		}

		for (int i = 0; i < N; i++) {
			matrix[i] = Arrays.copyOf(tmp[i], N);
		}
	}

	public static int t93(int[][] matrix ) {
		final int N = matrix.length;
		int maxCount = -1;
		int tmpCount = 0;
		int tmpPrewElement = matrix[0][0];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				// if(matrix[i][j] < tmpPrewElement){ min
				if (matrix[i][j] > tmpPrewElement) {//max
					tmpCount++;
					if (maxCount <= tmpCount) {
						maxCount = tmpCount;
					}
				} else {
					tmpCount = 1;
				}
				tmpPrewElement = matrix[i][j];
			}
		}
		return maxCount;
	}

	public static int[] t94(int[][] matrix) {
		final int N = matrix.length;
		int[] sum = new int[N];
		int tmpFirstIndex = -1;
		int tmpSecondIndex = -1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (matrix[i][j] > 0 && tmpFirstIndex < 0) {
					tmpFirstIndex = matrix[i][j];
					continue;
				}
				if (matrix[i][j] > 0 && tmpFirstIndex != -1
						&& tmpSecondIndex < 0) {
					tmpSecondIndex = matrix[i][j];
					continue;
				}
				if (tmpFirstIndex != -1 && tmpSecondIndex < 0) {
					sum[i] += matrix[i][j];
				}
			}
			if (tmpFirstIndex < 0 || tmpSecondIndex < 0) {
				sum[i] = -1;
			}
			tmpFirstIndex = -1;
			tmpSecondIndex = -1;
		}
		return sum;
	}

	public static void t95(int[][] matrix, int n) {
		final int N = matrix.length;
		int[][] tmp = new int[N][N];
		switch (n) {
		case 180:
			for (int i = N - 1, x = 0; i >= 0; i--, x++) {
				for (int j = matrix[i].length - 1, y = 0; j >= 0; j--, y++) {
					tmp[y][x] = matrix[j][i];
				}
			}
			for (int i = 0; i < N; i++) {
				matrix[i] = Arrays.copyOf(tmp[i], N);
			}
			break;
		case 270:
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					tmp[j][N - i - 1] = matrix[i][j];
				}
			}
			for (int i = 0; i < N; i++) {
				matrix[i] = Arrays.copyOf(tmp[i], N);
			}
			break;
		case 90:
			for (int i = 0, y = N - 1; i < N; y--, i++) {
				for (int j = 0; j < N; j++) {
					tmp[y][j] = matrix[j][i];
				}
			}
			for (int i = 0; i < N; i++) {
				matrix[i] = Arrays.copyOf(tmp[i], N);
			}
			break;
		default:
			System.out.println("NO");
			break;

		}
	}

	public static int[][] t96(int[][] matrix) {
		final int N = matrix.length;
		int[][] tmp = new int[N][N];
		double avg = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				avg += matrix[i][j];
			}
		}
		avg /= N*N;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] -= Math.floor(avg);
			}
		}
		return tmp;
	}
	
	public static int[][] t97(int[][] matrix) {
		final int N = matrix.length;
		int M=matrix.length;
		int[][] tmp = new int[N][M];
		/*int nullCount = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(matrix[i][j]==0)
			    	nullCount++;
				
					
			}
		}
			if(nullCount==N){
				M--;
				for (int k = 0; k < N; k++) {
					matrix[k] = Arrays.copyOf(tmp[k], M);
				}						
		}*/
		return tmp;
	}

}
