package com.cts.training2;
import java.util.*;
import java.util.Arrays;
public class SortingAlphabet 

{   public static void main(String args[]) 
	{
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter String:");
	String str = input.next();
	
	char[] charArray = str.toCharArray();
	Arrays.sort(charArray);
	String sortedString = new String(charArray);
	System.out.println(sortedString);  
	
	}
}