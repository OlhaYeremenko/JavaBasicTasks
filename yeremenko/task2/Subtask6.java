package com.epam.at.yeremenko.task2;

import java.util.ArrayList;

public class Subtask6 {
	public static void t6(ArrayList<Integer> inputNumbers) {
	for (int i = 0; i < inputNumbers.size(); i++) {
		int count = 1;
		for (int j = 1; j < inputNumbers.get(i).toString().length(); j++) {
			if ((int) inputNumbers.get(i).toString().charAt(j) >= (int)inputNumbers.get(i).toString().charAt(j - 1))
				count++;
		}
		if (count == inputNumbers.get(i).toString().length()) {
			System.out.println(inputNumbers.get(i));
			break;
		}
	}
	}
}
