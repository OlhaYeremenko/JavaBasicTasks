package com.epam.at.yeremenko.lab1;


public class InsertionSorter {	

		 public static void sort(int[] arr) {
		  for (int k = 1; k < arr.length; k++) {
		   int location = k;
		   int newElement = arr[k];

		   while (location > 0 && arr[location - 1] >= newElement) {
		    location--;
		   }
		   //location = Arrays.binarySearch(arr, newElement, arr.length, k); не знаю как правильно применить		
		   System.arraycopy(arr, location, arr, location + 1, k - location);
		   arr[location] = newElement;
		  }
		 }
	}



