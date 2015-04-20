package com.epam.at.yeremenko.lab1;

public class SelectionSorter {
    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
        	int temp=arr[barrier];
        	int itemp=barrier;
        	
            for (int index = barrier + 1; index < arr.length; index++) {
            	if (arr[index] < temp) 
            	{   itemp =index;
            		temp=arr[index];          		            		
            	}                     	
            }
            arr[itemp] = arr[barrier];
			arr[barrier] = temp;
        }
    }

}
