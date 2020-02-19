package com.cts.training2;

import java.util.ArrayList;
import java.util.ListIterator;
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>();
		list.add("hello");
		list.add("to");
		list.add("Java");
		list.add("Batch");
		list.add("7");
		list.add("true");
		
		ListIterator<String>it=list.listIterator();
		System.out.println("*****Forward Direction******");
		while(it.hasNext())
		{
			String element=it.next();
			System.out.println(element);
		}
			
		System.out.println("*****BackwordDirection******");
		while(it.hasPrevious())
		{
			String element =it.previous();
			System.out.println(element);
			
		}
			
		}
		
		
}
