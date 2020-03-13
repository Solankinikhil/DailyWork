package com.cts.training.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.training.bean.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	
	Connection conn = getConnection();
	PreparedStatement ps= null;
	
	

	@Override
	public boolean saveEmployee(Employee employee) {
		String sql ="insert into employee values(?,?,?,?,?,?,?)";
		try {
			ps =conn.prepareStatement(sql);
			
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setString(3,employee.getAddress());
			ps.setString(6, employee.getDesignation());
			ps.setInt(4, employee.getAge());
			ps.setDouble(7, employee.getSalary());
			ps.setLong(5, employee.getPhone());
			
			
			
			ps.executeUpdate();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		String sql="update employee set name=? where id=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, employee.getName());
			ps.setInt(2, employee.getId());
			
		
			ps.executeUpdate();
			
			return true;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
	}
		
		
	

	
	
	
	@Override
	public boolean deleteEmployee(Employee employee) { int result=0;
		String sql="delete from employee where id=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, employee.getId());
		
			ps.executeUpdate();
			
			return true;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
	}

	
	
	
	
	@Override
	public Employee getEmployeeById(int id) {
		String sql="select * from employee where id=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			Employee emp=null;
			
			while(rs.next())
			{
				emp =new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setAge(rs.getInt("age"));
				emp.setAddress(rs.getString("adress"));
				emp.setPhone(rs.getLong("phone"));
			}return emp;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees=new ArrayList<Employee>();
		String sql="select *from employee";
		try {
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Employee emp =new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setAge(rs.getInt("age"));
				emp.setAddress(rs.getString("adress"));
				emp.setPhone(rs.getLong("phone"));
				employees.add(emp);
				
				
			}
			return employees;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	private Connection getConnection() {
		Connection conn = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/ctspune";
			conn = DriverManager.getConnection(url, "root", "root");
			return conn;
		} catch (Exception e) {
			return null;
		}

	}
}
