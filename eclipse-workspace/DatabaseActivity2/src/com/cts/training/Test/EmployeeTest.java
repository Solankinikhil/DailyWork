package com.cts.training.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.cts.training.bean.Employee;
import com.cts.training.dao.impl.EmployeeDAO;
import com.cts.training.dao.impl.EmployeeDAOImpl;

public class EmployeeTest {

	private static EmployeeDAO employeeDAO;
	private static Employee employee;

	@BeforeClass
	public static void init() {
		employee = new Employee();
		employeeDAO = new EmployeeDAOImpl();
	}

	@Ignore
	@Test
	public void test_add_employee_success() {
		Employee emp = new Employee(134, "Bharat", "mumbai", "PAT", 22, 24415, 464563673);
		assertEquals(true, employeeDAO.saveEmployee(emp));
	}

	@Ignore
	@Test
	public void test_getEmployeeByID_success() {
		Employee emp = employeeDAO.getEmployeeById(133);
		assertEquals("Bharat", emp.getName());
	}

	@Ignore
	@Test()
	public void test_get_All_Employee_success() {
		List<Employee> list = employeeDAO.getAllEmployees();
		assertEquals("Nikhil", list.get(0).getName());

	}
	@Ignore
	@Test
	public void test_update_Employee_success() {
	EmployeeDAO empObj= new EmployeeDAOImpl();
	Employee employee1 = empObj.getEmployeeById(4);
	employee1.setName("MS");
	empObj.updateEmployee(employee1);
	assertEquals(true, employeeDAO.updateEmployee(employee1));
	}
	@Test
	public void test_delete_Employee_success() {
		Employee emp = employeeDAO.getEmployeeById(133);
		assertEquals(true, employeeDAO.deleteEmployee(emp));
		
		
	}
	
	
	
}
