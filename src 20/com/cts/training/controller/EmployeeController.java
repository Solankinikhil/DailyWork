package com.cts.training.controller;

import java.util.List;
import java.util.Scanner;

import com.cts.training.bean.Employee;
import com.cts.training.dao.impl.EmployeeDAOImpl;
;

public class EmployeeController {

	public static void main(String[] args) {
		
		EmployeeDAOImpl empObj = new EmployeeDAOImpl();
		System.out.println("Employee Management");
		System.out.println("select your option");
		System.out.println("1.Add Employee");
		System.out.println("2.Update Employee");
		System.out.println("3.Remove Employee");
		System.out.println("4.Get emp by id");
		System.out.println("5.Display all");
		System.out.println("6.Exit");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		
		switch (num) {
		  case 1:
			  System.out.println("Enter id");
			  String idd=sc.nextLine();
			  
			  
			  System.out.println("Enter Name");
			  String name1=sc.nextLine();
			  System.out.println("Enter address");
			  String add1=sc.nextLine();
			  System.out.println("Enter designation");
			  String desig1=sc.nextLine();
			  System.out.println("Enter age");
			  int age1=sc.nextInt();
			  System.out.println("Enter salary");
			  double salary1=sc.nextInt();
			  System.out.println("phone no");
			  long phoneno=sc.nextInt();
			  
			  
				Employee emp = new Employee(idd,name1,add1,desig1,age1,salary1,phoneno);
				empObj.addEmployee(emp);
				
				
				List<Employee> list = empObj.getAllEmployees();
				list.forEach(System.out::println);
				
			  
			  
			  
			  
			  
		    
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		 
		}
		
		
		
		
		
		
		
	/*	Employee emp = new Employee(111, "Disha", "Bhopal", "Digital Engineer", 22, 46566.77, 46546656L);
		empObj.addEmployee(emp);
		
		
		List<Employee> list = empObj.getAllEmployees();
		list.forEach(System.out::println); 
		
		System.out.println("<......ID......>");
		
		Employee e=empObj.getEmployeeById(9987);
		System.out.println(e);
		
	    System.out.println("<......Delete......>");
		
		//empObj.deleteEmployee(e);
		//list.forEach(System.out::println);
		
		System.out.println("<.......UPDATE.......>");
		empObj.updateEmployee(e);
		list.forEach(System.out::println); */
		
		
		
	
	}

}

