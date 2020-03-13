package com.cts.training27;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStream {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		
		addEmployees(employees);
		//1. Employees with age greater than 20
		
		List<Employee> ageFilter = employees.stream().filter(e -> e.getAge()>20).collect(Collectors.toList());
		System.out.println("Employees with greater than 20");
		ageFilter.forEach(System.out::println);
		
		//2. Employees name starts with N
		List<Employee> namefilter=employees.stream().filter(p -> p.getName().startsWith("N")).collect(Collectors.toList());
		System.out.println("employee with name starts with N=");
		namefilter.forEach(System.out::println);
		
		//3. Increase salary by 15%
		List<Employee> salaryMap=employees.stream().map(emp ->{emp.setSalary(emp.getSalary()+emp.getSalary()*1.15); return emp;}).collect(Collectors.toList());
		System.out.println("employee salary Increase  by 15% ");
		salaryMap.forEach(System.out::println);
		
		//4.AT EVEN/ODD PLACE ADD PREFIX BEFORE NAMES
		List<Employee> addMrMs = employees.stream().map(s -> {
		    if(s.getId()%2==0) {
		    	s.setName("Mr."+ s.getName());
		    }
		    else {
		    	s.setName("Ms. "+s.getName());
		    }
		    return s;
	 }).collect(Collectors.toList());
	 addMrMs.forEach(System.out::println);
	 }
        
		

	

	private static void addEmployees(ArrayList<Employee> employees) {
		Employee emp1 = new Employee(1, "Vijay", "banglore", "PAT", 22, 21000, 4548578);
		Employee emp2 = new Employee(2, "Neeraj", "mumbai", "ET", 19, 31000, 3348578);
		Employee emp3 = new Employee(3, "Sakshi", "pune", "PA", 21, 41000, 4448578);
		Employee emp4 = new Employee(4, "Nikhil", "indore", "ETT", 28, 51000, 45455578);
		Employee emp5 = new Employee(5, "Neha", "chennai", "EAS", 23, 61000, 4338578);
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		
	
	
	}

}
