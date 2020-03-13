package com.cts.training5;

import java.util.*;
public class Digits {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter The Number:");
		  int  num = sc.nextInt();
		 
		  int sum=0,count =1;
		  while(num > 0 || sum > 9) 
		    { 
		        if(num == 0) 
		        {   count++;
		            num = sum; 
		            sum = 0; 
		        } 
		        sum  =sum + num % 10; 
		        num = num  / 10; 
		    } 
		    System.out.println(count);
	}
}