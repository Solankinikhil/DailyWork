package com.cts.training6;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int number = sc.nextInt();
		int sum = 0;
		int[] arr = new int[number];

		System.out.println("Enter elements");
		for (int i = 0; i < number; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < number; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of all elements stored in the array is :" + sum);

	}

}
