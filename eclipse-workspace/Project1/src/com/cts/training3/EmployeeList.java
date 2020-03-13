package com.cts.training3;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {

	public static void main(String[] args) {
		
		ArrayList<Employee>list=new ArrayList<>();
		addEmployee(list);
		Collections.sort(list, new SortByDesignation());
		for(Employee emp:list) {
		System.out.println(emp);
		}
		
	}

	private static void addEmployee(ArrayList<Employee> list) {
		Employee emp1= new Employee(1033, "Nikhil", "PAT", 23, 21700,8989610286L); 
		Employee emp2= new Employee(1030, "Neeerav", "Et",44, 55700,2089610286L); 
		Employee emp3= new Employee(1044, "Neha", "TESt ENgineer", 43, 121700,5589610286L); 
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		
	}
}
