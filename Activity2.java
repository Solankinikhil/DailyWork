package com.cts.training;

public class Activity2 {
	
	 public static boolean isTitleCase(String s)
	{
		 boolean result=false;
		 String arr[]=s.split("\\s+");
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 char ch=arr[i].charAt(0);
			 if(ch>65&& ch<=90)
			 	{
	              result=true;
			 	}
			 else {
				 result=false;
				 break;
			      } 
		 }return result;
	}
	
	
	

	public static void main(String args[])
	{
		String str="Global Warming";
		int len=str.length();
		
		System.out.println("last 4 characters");
		System.out.println(str.substring(len-4,len));
		
	    System.out.println(str.substring(4,9));
	    
	    System.out.println(str.matches("[A-Za-z0-9]+"));
	    
	    //trim 4  from  last
	    String tr=str.substring(len-4);
	    System.out.println(tr);
	    
	    //trim 4 from first
	    System.out.println(str.substring(0,4));
	    
	   
	   //Starting index
	   int str2= str.indexOf("Wa");
	   System.out.println(str2);
	   
	  
	  //a with * 
	   String replace = str.replace('a','*');
	   System.out.println(replace);
	   
	   System.out.println(isTitleCase(str));
	   
	   
	   
	   }
}
