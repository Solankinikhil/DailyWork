package com.cts.training.controller;

import java.util.List;
import java.util.Scanner;

import com.cts.training.bean.Employee;
import com.cts.training.dao.impl.EmployeeDAO;
import com.cts.training.dao.impl.EmployeeDAOImpl;


public class EmployeeController {

	public static void main(String[] args) {
		
	EmployeeDAO employeeDAO = new EmployeeDAOImpl();
	Scanner sc=new Scanner(System.in);
	
	
//	List<Employee> list=employeeDAO.getAllEmployees();
	//list.forEach(System.out::println);

//	Employee employee=new Employee(11, "Abhishekh", "Pune", "PAT", 22, 25000, 4564646);
	//employeeDAO.saveEmployee(employee);
	
//	Employee emp = employeeDAO.getEmployeeById(11);
//	System.out.println(emp);
	
	//Employee emp = employeeDAO.getEmployeeById(2);
	//emp.setName("nik");
	//employeeDAO.updateEmployee(emp);
	int choice;
	char ch;
	do {
		System.out.println("1. Add employee");
		System.out.println("2.get ele,ent by id");
		System.out.println("3. udpate");
		System.out.println("4. delete");
		System.out.println("5. display all");
		System.out.println("6. Exit");
		System.out.println("Enter your choice::");
		
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			Employee employee=new Employee(11, "Abhishekh", "Pune", "PAT", 22, 25000, 4564646);
			employeeDAO.saveEmployee(employee);
			
			break;
		case 2:
			Employee emp = employeeDAO.getEmployeeById(2);
			System.out.println(emp);
			break;
		case 3:
			Employee emp2 = employeeDAO.getEmployeeById(2);
			emp2.setName("rrr");
			employeeDAO.updateEmployee(emp2);
			System.out.println("Updated successfully");
			break;
		case 4:
			break;
		case 5:
			List<Employee> list=employeeDAO.getAllEmployees();
			list.forEach(System.out::println);
			break;
		case 6:
			System.exit(0);
			
		}
		System.out.println("Continue ? Y/N");
		
		ch=sc.next().charAt(0);
		
	}while(ch!='N');
	}

}