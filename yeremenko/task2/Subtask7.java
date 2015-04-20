package com.epam.at.yeremenko.task2;

import java.util.Arrays;

public class Subtask7 {
	public static void t7(int[] arr) {

		String[] str = new String[arr.length];
		for (int j = 0; j < arr.length; j++) {
			str[j] = String.valueOf(arr[j]);
		}

		for (int i = 0, count; i < str.length; i++) {
			Integer[] sortArr = new Integer[str[i].length()];
			for (int j = 0; j < sortArr.length; j++) {
				sortArr[j] = (int) str[i].charAt(j);
			}

			Arrays.sort(sortArr);
			count = 1;

			for (int j = 1; j < sortArr.length; j++) {
				if (sortArr[j] > sortArr[j - 1])
					count++;
			}
			if (count == str[i].length()) {
				System.out.println(str[i]);
				return;
			}
		}
	}
}
