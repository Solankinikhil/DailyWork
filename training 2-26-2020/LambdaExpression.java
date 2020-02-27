package com.cts.training6;

public class LambdaExpression {

	public static void main(String[] args) {
	//	Runnable r=() -> System.out.println("Hello Runnable");
	//	Thread t=new Thread(r);
	//	t.start();
		
	//	Hello1 h= () -> "Good morning";
	//	System.out.println(h.greetings());
		
	//	Hello1 h2= () -> "Good night";
	//	System.out.println(h2.greetings());
		
	//	Hello1 h3= () -> "Good evening";
	//	System.out.println(h3.greetings());
		
		
		Hello1 add= (a,b) -> a+b;
		System.out.println(add.calculate(3, 6));
		Hello1 sub= (a,b) -> a-b;
		System.out.println(sub.calculate(6, 3));
		Hello1 mul= (a,b) -> a*b;
		System.out.println(mul.calculate(3, 6));
		Hello1 div= (a,b) -> a/b;
		System.out.println(div.calculate(6, 3));
		
		
		
	}

}

@FunctionalInterface
interface Hello1
{
	//String greetings();
	//public void display();
	double calculate(double a, double b);
	
}