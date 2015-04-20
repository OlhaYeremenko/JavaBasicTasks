package com.epam.at.yeremenko.task1;

import java.util.Random;
import java.util.Scanner;

public class Subtask2_5 {
	
	public static void  invertMethod (String[] arr) {
		for (int i = (arr.length / 2) - 1; i >= 0; i--){
			String tmp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = tmp;
			}
		for (String inv : arr){
			System.out.print(inv + " ");
		}
		
	}
	
	public static void randMethod (int n){
		Random rand = new Random();
		System.out.println();
		int out = 0;
		for (int i = 0; i < n; i++){
			out = rand.nextInt(n);
			System.out.print(out);
		}
	}
	
	public static void scanMethod(String str){
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt()){
		int num = scan.nextInt();
		if (num == Integer.parseInt(str) )
			System.out.println("password is good");
		else System.out.println("password is bad");
	}
		scan.close();
		}
	
	
	public static void sumArgsMethod(String ... args){
		int sum=0, multiple = 1;
		for (int i = 0; i < args.length; i++) {
			sum = sum + Integer.parseInt(args[i]);
			multiple = multiple * Integer.parseInt(args[i]);
		}
		System.out.println("Sum = "+ sum);
		System.out.println("Multiple = "+ multiple);
	}

}
