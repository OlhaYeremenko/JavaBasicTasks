package com.epam.at.yeremenko.task2;

import java.util.ArrayList;

public class Subtask5 {
	public static void t5(int[] arr) {

		String[] str = new String[arr.length];
		for (int j = 0; j < arr.length; j++) {
			str[j] = String.valueOf(arr[j]);
		}

		ArrayList<Integer> even = new ArrayList<Integer>();

		for (int i = 0, count; i < str.length; i++) {
			count = 0;

			for (int j = 0; j < str[i].length(); j++) {
				if (new Integer(str[i].charAt(j) + "") % 2 == 0)
					count++;
				if (count == str[i].length())
					even.add(new Integer(str[i]));
			}
		}

		for (int i = 0; i < even.size(); i++) {
			for (int j = 0; j < even.size(); j++) {
				if ((even.get(i).toString().length() == even.get(j).toString()
						.length())
						&& j != i) {
					System.out.println(even.get(i));
					break;
				}
			}
		}
	}
}
