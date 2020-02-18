package com.cts.training;

public class Employee {
	private double salary = 10000;
	private String Designation = "PAT";
	private int age = 22;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}



public static void main(String[] args)
{
	Employee e=new Employee();
	System.out.println("Before salary="+ e.getSalary());
	System.out.println("Before designation="+ e.getDesignation());
	System.out.println("Before Age="+ e.getAge());
	
	e.setAge(25);
	e.setDesignation("PA");
	e.setSalary(21700);
	
	System.out.println("After salary="+ e.getSalary());
	System.out.println("After designation="+ e.getDesignation());
	System.out.println("After Age="+ e.getAge());
	
}
	
}

class Salary extends Employee
{
	private int salary,BasicPay,DA,HRA,GrossPay,PF;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	void GetData1()
	
	{
		
	}
	
}





