package com.epam.at.yeremenko.lab1;

public class Matrix_mul {
	
public static int[][] multMatrix(int[][] matrix1,int[][] matrix2){
		
		if(matrix1 == null || matrix2 == null)
			throw new IllegalArgumentException();
		
		int rowSize = matrix1[0].length;
		for (int i = 1; i < matrix1.length; i++) {
			if(matrix1[i] == null || rowSize != matrix1[i].length)
				throw new IllegalArgumentException();		
		}
		
		rowSize = matrix2[0].length;
		for (int i = 1; i < matrix2.length; i++) {
			if(matrix2[i] == null || rowSize != matrix2[i].length)
				throw new IllegalArgumentException();
		}
		
		if(matrix1.length != matrix2[0].length && matrix2[0].length != matrix2.length )
			throw new IllegalArgumentException();
		
		if(matrix2[0].length < matrix1[0].length){
		    int[][]temp =matrix2;
		    matrix2 = matrix1;
		    matrix1 = temp;
		}
		
		int col = matrix2[0].length;
		int row = matrix1.length;
		int [][] resultMatrix = new int[row][col];
		
		for (int i = 0; i < row; i++) {	
			for (int j = 0; j < col; j++) {
				for (int k = 0; k <  matrix2.length; k++) {
					resultMatrix[i][j] += (matrix1[i][k] * matrix2[k][j]);
				}
			}
		}
		return resultMatrix;
	}	
	
	
	
	
}
