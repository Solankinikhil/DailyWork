package com.cts.training2;
import java.util.*;
public class Assignment1 
{
	
	public static void main(String args[])
	{
		 Scanner input = new Scanner(System.in);
		  System.out.println("Enter string :");
		   String str = input.nextLine();
	
	  String[] arrSplit_3 = str.split("\\s");
	  
	    
	  
	  for (int i=0; i < arrSplit_3.length; i++)
	    {
	      
		  System.out.println(arrSplit_3[i]);
	    
	    }
	 }
}

