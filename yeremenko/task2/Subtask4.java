package com.epam.at.yeremenko.task2;

import java.util.ArrayList;

public class Subtask4 {
	public static void t4(ArrayList<Integer> inputNumbers) {
		int[] maxNumber = new int[inputNumbers.size()];

		for (int i = 0; i < inputNumbers.size(); i++) {
			for (int k = 0; k <= 9; k++) {
				if (!inputNumbers.get(i).toString().contains(k + ""))
					maxNumber[i]++;
			}
		}

		int max = maxNumber[0], min_index = 0;
		for (int i = 0; i < maxNumber.length; i++) {
			if (max < maxNumber[i]) {
				min_index = i;
				max = maxNumber[i];
			}
		}
		System.out.println("Различие цифр минимально: "+inputNumbers.get(min_index));
	}
}
