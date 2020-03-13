package com.cts.training;



public class Test {

	public void main(String[] args)
	{
		A1 a1=new B();
		a1.display();
	}
}
class A1 {
	
		
		public void display()
	
	{
		
		System.out.println("Class A");
	}
}
	class B extends A1
	{
		public void display()
		{
			System.out.println("Class B");
		}
	}
	
