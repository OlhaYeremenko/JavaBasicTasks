package com.epam.at.yeremenko.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Enter № of task(1-6) or 0 to exit \n ");	
		while (true) {
			Scanner sr = new Scanner(System.in);
			int state = sr.nextInt();
			switch (state) {
			case 0:
				System.exit(0);
			case 1:
				System.out.println("Input your name");
				Subtask1.getName(sr.next());
				break;
			case 2:			
				Subtask2_5.invertMethod(args);
				break;
			case 3:
				System.out.println("Input count of random numbers ");
				Subtask1.subTask3(Integer.parseInt(sr.next()));
				break;
			case 4:
				System.out.println("Input password ");				
				Subtask2_5.scanMethod(sr.nextLine());
				
				break;
			case 5:
				Subtask2_5.sumArgsMethod(args);
				break;
			case 6:
				ArrayList<Integer> inputNumbers = new ArrayList<Integer>();
				System.out.print("Введите целые числа через пробел, "
						+ "для окончания введите q: ");
				while (sr.hasNext()) {
					String number = sr.next();
					if (number.equals("q")) {
						break;
					} else {
						try {

							inputNumbers.add(Integer.parseInt(number));
						} catch (NumberFormatException e) {
							System.out.print("Неправильный формат. ");
							break;
						}
					}
				}

				Subtask1.t61OddAndEven(inputNumbers);
				Subtask1.t62MinMax(inputNumbers);
				Subtask1.numderDividedOn39(inputNumbers);
				Subtask1.numderDividedOn57(inputNumbers);
				break;
			}
		}
	}
}
