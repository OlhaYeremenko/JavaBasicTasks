package com.epam.at.yeremenko.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Subtask1 {

	public static void getName(String name) {
		System.out.println("Hello my dear " + name + " !!");
	}

	public static void subTask3(int count) {
		Random r = new Random();
		int arrOfNumbers[] = new int[count];
		for (int i = 0; i < count; i++)
			arrOfNumbers[i] = r.nextInt(100);
		System.out.println("In line");
		for (int i = 0; i < count; i++)
			System.out.print(arrOfNumbers[i]);
		System.out.println("\nWith new line");
		for (int i = 0; i < count; i++)
			System.out.println(arrOfNumbers[i]);

	}

	public static void t61OddAndEven(ArrayList<Integer> inputNumbers) {
		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		for (int number : inputNumbers) {
			if (number % 2 == 0) {
				if (!oddNumbers.contains(number))
					oddNumbers.add(number);
			} else {
				if (!evenNumbers.contains(number))
					evenNumbers.add(number);
			}
		}
		System.out.println("evenNumber\n");
		for (int number : evenNumbers)
			System.out.print(number + "  ");
		System.out.println("oddNumbers\n");
		for (int number : oddNumbers)
			System.out.print(number + "  ");

	}

	public static void t62MinMax(ArrayList<Integer> inputNumbers) {
		System.out.println(Collections.max(inputNumbers));
		System.out.println(Collections.min(inputNumbers));
	}

	public static void numderDividedOn39(ArrayList<Integer> inputNumbers) {
		int divider1 = 3;
		
		System.out.println("Numbers that devide on 3 or 9 :\n");
		for (int number : inputNumbers) {
			if (number % divider1 == 0)  {
				System.out.print(number + "  ");
			}
		}
		System.out.println();
	}
	
	public static void numderDividedOn57(ArrayList<Integer> inputNumbers) {
		int divider1 = 5;
		int divider2 = 7;
		System.out.println("Numbers that devide on 5 and 7 :\n");
		for (int number : inputNumbers) {
			if (number % divider1 == 0 && number % divider2 == 0) {
				System.out.print(number + "  ");
			}
		}
		System.out.println();
	}
	
	public static void numberWithThreeDifferentDigits(ArrayList<Integer> inputNumbers) {
		String number;
		System.out.print("¬се трехзначные числа, "
				+ "в дес€тичной записи которых нет одинаковых цифр: ");
		for (int inputNumber : inputNumbers) {
			if ((int) Math.log10(Math.abs(inputNumber)) + 1 == 3) {
				number = String.valueOf(inputNumber);
				if ((number.charAt(0) != number.charAt(1))
						&& (number.charAt(1) != number.charAt(2))
						&& (number.charAt(0) != number.charAt(2))) {
					System.out.print(inputNumber + "  ");
				}
			}
		}
	}
	public static void numberHappy(ArrayList<Integer> inputNumbers) {
		System.out.print("У—частливыеФ числа");
		int digit1, digit2, digit3, digit4;
		for (int inputNumber : inputNumbers) {
			if ((int) Math.log10(Math.abs(inputNumber)) + 1 == 4) {
				digit1 = inputNumber / 1000;
				digit2 = inputNumber / 100 % 10;
				digit3 = inputNumber % 100 / 10;
				digit4 = inputNumber % 10;
				if (digit1 + digit2 == digit3 + digit4) {
					System.out.print(inputNumber + "  ");
				}
			}
		}

	}
	public static void numberOfHalfSumOfNeighbors(ArrayList<Integer> inputNumbers) {
		System.out.print("Ёлементы, которые равны полусумме соседних "
				+ "элементов: ");
		if (inputNumbers.size() >= 3) {
			for (int i = 1; i < inputNumbers.size() - 1; i++) {
				if (inputNumbers.get(i) == ((float) (inputNumbers.get(i-1) + inputNumbers.get(i+1)) / 2)) {
					System.out.print(inputNumbers.get(i) + ", ");
				}
			}
		} else {
			System.out.print("sourceNumbers.length < 3");
		}
		System.out.println();
	}

}