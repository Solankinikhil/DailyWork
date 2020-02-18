package firstPackage;

public class A 
{
	A()
	{
		super();
		System.out.println("1");   
	}
	{
		System.out.println("2");
	}
	
	public static void main(String args[])
	{
		B a=new B(5);
	}
	
}

class B extends A
{
	B()
	{
		super();
		System.out.println("3");
		
	}
	B(int a)
	{
		this();
		System.out.println("4");
		
	}
	{
		System.out.println("5");
	}
}

	
	