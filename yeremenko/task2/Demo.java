package com.epam.at.yeremenko.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> input = new ArrayList<Integer>();

		System.out.print("������� ����� ����� ����� ������, "
				+ "��� ��������� ������� q: ");
		while (true) {
			String number = in.next();
			if (number.equals("q")) {
				break;
			} else {
				try {
					input.add(Integer.parseInt(number));
				} catch (NumberFormatException e) {
					System.out.print("������������ ������. ��������� ����: ");
				}
			}
		}
		if (input.size() == 0) {
			System.exit(0);
		}

		input.add(10);
		input.add(154);
		input.add(2);
		input.add(7999);
		input.add(2222);
		int[] inputNumbers = new int[input.size()];
		System.arraycopy(toIntArray(input), 0, inputNumbers, 0, input.size());
		System.out.println(Arrays.toString(inputNumbers));
		System.out
				.println("Subtask1 1. ����� ����� �������� � ����� ������� �����. ������� ��������� ����� � �� �����.");
		Subtask1.shortLong(input);

		System.out
				.println("Subtask2 2. ����������� � ������� ����� � ������� ����������� (��������) �������� �� �����.");
		Subtask2.t2(input);
		System.out.println();

		System.out
				.println("Subtask3 3. ������� �� ������� �� �����, ����� ������� ������ (������) �������, � ����� �����.");
		Subtask3.t3(input);
		System.out.println();

		System.out
				.println("Subtask4 4. ����� �����, � ������� ����� ��������� ���� ����������. ���� ����� ����� ���������, ����� ������ �� ���.");
		Subtask4.t4(input);
		System.out.println();

		System.out
				.println("Subtask5 5. ����� ���������� �����, ���������� ������ ������ �����, � ����� ��� ���������� ����� � ������ ������ ������ � �������� ����.");
		Subtask5.t5(inputNumbers);
		System.out.println();

		System.out
				.println("Subtask6 6. ����� �����, ����� � ������� ���� � ������� ������� �����������. ���� ����� ����� ���������, ����� ������ �� ���.");
		Subtask6.t6(input);
		System.out.println();

		System.out
				.println("Subtask7 7. ����� �����, ��������� ������ �� ��������� ����. ���� ����� ����� ���������, ����� ������ �� ���.");
		Subtask7.t7(inputNumbers);
		System.out.println();

		System.out
				.println("Subtask8 8. ������� ����� �� 1 �� k � ���� ������� N x N (N=3)����� �������");
		Subtask8.t8(3, "l");
		System.out
				.println("Subtask8 8. ������� ����� �� 1 �� k � ���� ������� N x N (N=3)������ ����.");
		Subtask8.t8(3, "t");
		System.out.println();

		System.out.println(".................Subtask9........................");
		System.out.println("������� ������ �������� ");
		int[][] arr = Subtask9.inputMatrix();
		Subtask9.printMatrix(arr);
		System.out.println();
		System.out.println("top on 2 ");
		Subtask9.t92t(arr, 2);
		Subtask9.printMatrix(arr);
		System.out.println();
		System.out.println("right on 1 ");
		Subtask9.t92r(arr, 1);
		Subtask9.printMatrix(arr);
		System.out.println("bottom on 2 ");
		Subtask9.t92b(arr, 2);
		Subtask9.printMatrix(arr);
		System.out.println("left on 2 ");
		Subtask9.t92l(arr, 2);
		Subtask9.printMatrix(arr);

		int[][] arr1 = Subtask9.inputMatrix();
		Subtask9.printMatrix(arr1);
		System.out.println();
		System.out.println(Subtask9.t93(arr1));
		System.out.println();
		Subtask9.sortMatrixsRows(arr1);
		Subtask9.printMatrix(arr1);
		System.out.println();
		Subtask9.t92r(arr1, 2);
		Subtask9.printMatrix(arr1);
		System.out.println();
		Subtask9.t92l(arr1, 2);
		Subtask9.printMatrix(arr1);
		System.out.println();
		Subtask9.t92b(arr1, 1);
		Subtask9.printMatrix(arr1);
		System.out.println();
		Subtask9.t92t(arr1, 1);
		Subtask9.printMatrix(arr1);
		System.out.println();
		int sum[] = Subtask9.t94(new int[][] { { 1, -3, 4, 4 },
				{ 3, 3, -2, -3 }, { 4, -2, -1, 5 }, { 2, 3, 4, 5 } });
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(sum[i]);
		}

		System.out.println();
		arr1 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		Subtask9.t95(arr1, 270);
		Subtask9.printMatrix(arr1);
		System.out.println();
		Subtask9.t96(arr1);
		Subtask9.printMatrix(arr1);
		System.out.println();

		arr1 = new int[][] { { 1, 2, 8 }, { 0, 0, 0 }, { 7, 8, 9 } };
		Subtask9.t97(arr1);
		Subtask9.printMatrix(arr1);
		System.out.println();

	}

	public static int[] toIntArray(List<Integer> list) {
		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}
}
