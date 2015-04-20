package com.epam.at.yeremenko.lab1;

import java.util.Arrays;

import com.epam.at.yeremenko.task2.Subtask9;

public class Demo {

	public static void main(String[] args) {
	 int [] arr;
	 
	 arr=new int[]{6,1,7,5,9,2,5,2,3,4,8,6,1,7,9};
	 System.out.println(Arrays.toString(arr));

     ArrayInverter.invert(arr);
     System.out.println("ai.invert(arr)");
     System.out.println(Arrays.toString(arr));
     
   
     arr=new int[]{1,2,6};
     int[] arr2;
     arr2=new int[]{1,2,3,4,5,8,9,12};
     Merger m= new Merger();
    
     System.out.println(" m.merge(arr, arr2)");
     System.out.println(Arrays.toString( m.merge(arr, arr2)));
     
    
     arr=new int[]{7,2,6,1,4,8,3};   		
     BubbleSorter bs= new  BubbleSorter();
     System.out.println(" BubbleSorter");
     bs.sort(arr);
     System.out.println(Arrays.toString(arr));
     
   
     arr=new int[]{6,1,7,5,9,2,10,15,8,4,8,6,1,7,9};
    
     System.out.println(" SelectionSorter");
     SelectionSorter.sort(arr);
     
     System.out.println(Arrays.toString(arr));
     
    
     arr=new int[]{6,1,7,5,9,2,10,15,8,4,8,6,1,7,9};
     System.out.println(" InsertionSorter");
     InsertionSorter.sort(arr);
     System.out.println(Arrays.toString(arr));
     
    int [][] arr2D1= new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    int [][] arr2D2=new int[][]{{1,3,3},{1,8,9},{7,5,9}};
    System.out.println("Matrix_mul"); 
    Subtask9.printMatrix( Matrix_mul.multMatrix(arr2D1, arr2D2));
     
	}
}
