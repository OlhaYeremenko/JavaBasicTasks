package com.epam.at.yeremenko.task2;

import java.util.ArrayList;

public class Subtask1 {
	 public static void shortLong(ArrayList<Integer> inputNumbers){
		 		 
			int min = inputNumbers.get(0).toString().length();
			int max = inputNumbers.get(0).toString().length();
			int max_pos = 0, min_pos = 0;

			for (int i = 0; i < inputNumbers.size(); i++) {
				if (inputNumbers.get(i).toString().length() > max) {
					max = inputNumbers.get(i).toString().length();
					max_pos = i;
				}
				if (inputNumbers.get(i).toString().length() < min) {
					min = inputNumbers.get(i).toString().length();
					min_pos = i;
				}
			}

			System.out.println("min: " + inputNumbers.get(min_pos) + ", length : " + min);
			System.out.println("max: " +inputNumbers.get(max_pos) + ", length : " + max);		

		 
	 }



	
	
}
