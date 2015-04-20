package com.epam.at.yeremenko.task2;

import java.util.ArrayList;
import java.util.Arrays;

import com.epam.at.yeremenko.lab1.SelectionSorter;

public class Subtask2 {

	public static void t2(ArrayList<Integer> inputNumbers ) {
	
		int [] inputLenght=new int[inputNumbers.size()];
		
		for (int i = 0; i < inputNumbers.size(); i++) {			
				inputLenght[i]=inputNumbers.get(i).toString().length();
			}
		SelectionSorter.sort(inputLenght);
		 System.out.println(Arrays.toString(inputLenght));
		
	}
		
		
}
