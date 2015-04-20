package com.epam.at.yeremenko.task2;

import java.util.ArrayList;

public class Subtask3 {
	public static void t3(ArrayList<Integer> inputNumbers) {

		int sum = 0;
		for (int i = 0; i < inputNumbers.size(); i++) {
			sum += inputNumbers.get(i).toString().length();
		}
		double arv=Math.floor(sum / inputNumbers.size());
		System.out
		.println("Среднее значение"+ arv);
		System.out
		.println("числа, длина которых больше средней, а также их длинна");
		for (int i = 0; i < inputNumbers.size(); i++) {
			if (arv > inputNumbers.get(i)
					.toString().length())				
			System.out.print( inputNumbers.get(i) + " ("
					+ inputNumbers.get(i).toString().length()+") ");
		}
		System.out
		.println("\nчисла, длина которых меньше средней, а также их длинна");
		for (int i = 0; i < inputNumbers.size(); i++) {
			if (arv < inputNumbers.get(i)
					.toString().length())				
			System.out.print( inputNumbers.get(i) + " ("
					+ inputNumbers.get(i).toString().length()+") ");
		}
	}
}
