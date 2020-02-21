package firstPackage;

public class Person {

	  void name()
	  
		  {
		  System.out.println("Person name");
		  }
	  
     public static void main(String args[])
     {
    	 Hr t1=new Hr();
    	 t1.emp();
    	 t1.name();
    	 t1.hr();
     }
}

class Emp extends Person {
	
	void emp() {
		System.out.println("hello emp");
	}
	
}

class Manager extends Emp
{
	void mgr()
	{
		System.out.println("Hello manager");
	}
}


class Hr extends Emp
{
	void hr()
	{
		System.out.println("Hello Hr");
	}
}







