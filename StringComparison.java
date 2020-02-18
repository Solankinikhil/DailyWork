package com.cts.training;

public class StringComparison {

	public static void main(String args[]){  
		   String city1="Pune";  
		   String city2="mumbai";  
		   String city3="Pune";  
		   String city4=new String("Pune");
		   String city5=new String("mumbai");
		   String city6=new String("Pune");
		   
		   System.out.println(city1==city3);
		   System.out.println(city3.contentEquals(city6));
		   System.out.println(city1==city4);
	}
	
}
