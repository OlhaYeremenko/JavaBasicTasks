package com.epam.at.yeremenko.lab1;

public class BubbleSorter {

    public  void sort(int[] arr) {
        for (int barrier = arr.length-1; barrier > 0; barrier--) {
        	
            for (int index = barrier; index>0; index--) {
                if (arr[index] < arr[index - 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index - 1];
                    arr[index - 1] = tmp;
                }
            }
        }
    }
       

}
