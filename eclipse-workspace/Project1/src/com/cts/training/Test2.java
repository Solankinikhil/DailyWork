package com.cts.training;

public class Test2 
{

	public static void main(String[] args) 
	{
		Nikk imp=new Nikk();
		System.out.println(imp.add(2,3));
		System.out.println(imp.sub(8,10));
	}
	
}

interface Add
{
	int add(int a,int b);
}

interface sub extends Add
{
	int sub(int a,int b);
}
class Div
{
	public int div(int a, int b)
	{
		return a/b;
	}
}


class Nikk extends Div implements sub
{
	public int add(int a, int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		if(a>b)
			return a-b;
		else 
		{
			return b-a;}
	}
	
}
