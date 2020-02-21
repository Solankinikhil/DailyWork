package com.cts.training;



public class Test 
		{

			public static void main(String[] args)
				{
					A a1=new B();
					a1.display();
				}
		}
class A {
	
		
			public void display()
	
				{
		
					System.out.println("Class A");
				}
		 }

class B extends A
		 {
			public void display()
				{
			
					System.out.println("Class B");
			
				}
		 }
	
