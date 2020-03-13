package com.cts.traning.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. load database driver
		//1.1 By using forName() method
		
		Class.forName("com.mysql.jdbc.Driver");
		
		//1.2 
		
		// Driver driver=new com.mysql.jdbc.Driver();
		
		//Establish the connection
		
		String url="jdbc:mysql://localhost:3306/ctspune";
		Connection conn =DriverManager.getConnection(url, "root", "root");
	//	System.out.println(conn.getClass().getName());
	// Execute SQL Queries	
		Statement stmt = conn.createStatement();
		
		//String query ="insert into employee values(5,'Jaddu','Rajkot',36,7766000286)";
		
		//String query="update employee set adress='Delhi' where id=3";
		
		//String query="delete from employee where id=5";
		
		String query="select * from employee";
		
		/* int result = stmt.executeUpdate(query);
		if(result>0)
		{
			System.out.println("Record deleted Succesfully");
		}
		else
		{
			System.out.println("Something went wrong");
		}
		*/
		
		
       ResultSet rs =stmt.executeQuery(query);
       
       while(rs.next())
       {
    	   
    	   int id = rs.getInt(1);
    	   String name = rs.getString(2);
    	   String adress = rs.getString(3);
    	   int age = rs.getInt(4);
    	   long phone = rs.getLong(5);
    	   System.out.println(id+" : "+name+" : "+adress+" : "+age+" : "+phone);
       }
       
       
		
		
		
	}

}
