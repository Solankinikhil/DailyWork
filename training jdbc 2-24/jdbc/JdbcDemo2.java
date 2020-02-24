package com.cts.traning.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//System.out.print("Enter employee Id:");
		//int id=Integer.parseInt(br.readLine());
		//System.out.print("Enter employee name:");
		//String name=br.readLine();
		//System.out.print("Enter employee adress:");
		//String adress=br.readLine();
		//System.out.print("Enter employee age:");
		//int age = Integer.parseInt(br.readLine());
		//System.out.print("Enter employee phone:");
		//long phone= Long.parseLong(br.readLine()); 
		
		
		Class.forName("com.mysql.jdbc.Driver");

		String url="jdbc:mysql://localhost:3306/ctspune";
		Connection conn =DriverManager.getConnection(url, "root", "root");
	//	String query="insert into employee values(?,?,?,?,?)";
	//	String query="update employee set name=? where id=?";
		
	//	String query="delete from employee where id=?";
		
	//	PreparedStatement ps = conn.prepareStatement(query);
		
	//	ps.setInt(1, id);
	//	ps.setString(1, name);
	/*	ps.setString(3, adress);
		ps.setInt(4, age);
		ps.setLong(5, phone);
		int result= ps.executeUpdate();
		
		if (result>0)
		{
			System.out.println("Data inserted succesfully");
		}
		else
		{
			System.out.println("Try again");
		}   */

		Statement stmt = conn.createStatement();
		
	     String query="select *from employee"; 
	     ResultSet rs =stmt.executeQuery(query);
	     int count=1;
	     while(rs.next())
	       {
	    	   
	    	   int id = rs.getInt(1);
	    	   String name = rs.getString(2);
	    	   String adress = rs.getString(3);
	    	   int age = rs.getInt(4);
	    	   long phone=rs.getLong(5);
	    	   
	    	   
	    	  System.out.println("-----------Employee "+count+"Record-----------"+"Employee id:"+id+"\n Employee name: "+name+" \n Address:"+adress+" \n Age: "+age+" \n Phone no. "+phone);
	    	  count++;
	       }
	
	
	
	
	
	
	
	
	
	}
}
