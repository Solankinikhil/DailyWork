package com.cts.training4;

import java.util.ArrayList;
import java.util.Scanner;

public class PrefixCountTask {
	
	/*2. String[] input={"100","111","10100","10","1111"}
   	input2="10"   
   	output=2;
    count strings having prefix "10" but "10" not included in count.*/
	

		
		public static void main(String[] args)
		{
		String[] ip={"100","111","10100","10","1111"};
		gteCount(ip);
		}
		public static void gteCount(String[] ip)
	{
		int op=0;
		ArrayList<String> l1=new ArrayList<String>();
		
		for(String s:ip)
			
		if(s.startsWith("10")&&(s.length()>2))
		l1.add(s);
		op=l1.size();
		
		
		System.out.println( op);	
		}
	}
		


