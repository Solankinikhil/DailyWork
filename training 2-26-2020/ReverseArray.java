package com.cts.training6;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int number=sc.nextInt();
		
		int[] arr=new int[number];
		
		System.out.println("Enter elements");
			for(int i=0;i<number;i++)
			{
				arr[i] =sc.nextInt();
			}
			System.out.print("Values stored are:\n");
			for(int i=0;i<number;i++)
			{
				System.out.println( arr[i] );
			}
			
			
			System.out.println("the Values in reverse order:");
			for(int i=(number-1);i>=0;i--)
			{
				System.out.println( arr[i] );
			}
	}

}
