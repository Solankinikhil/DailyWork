package com.cts.traning.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Table {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/ctspune";
		Connection conn =DriverManager.getConnection(url, "root", "root");
		Statement stmt = conn.createStatement();
		
		//String query="create table Student(ID int primary key,name varchar(50),subject varchar(60),marks int)";
		//String query1 ="insert into Student values(105,'dhoni','OS',77)";
		//String query3="update Student set marks=99 where ID=105";
		String query4="select * from Student";
		
		//int result = stmt.executeUpdate(query);
		//int result2 = stmt.executeUpdate(query1);
		//int result3 = stmt.executeUpdate(query3);
		
		
		 /* if(result3>0)
		{
			System.out.println("Record inserted Succesfully");
		}
		else
		{
			System.out.println("Something went wrong");
		}
		*/
		 ResultSet rs =stmt.executeQuery(query4);
	       
	       while(rs.next())
	       {
	    	   
	    	   int id = rs.getInt(1);
	    	   String name = rs.getString(2);
	    	   String subject = rs.getString(3);
	    	   int marks = rs.getInt(4);
	    	   
	    	   System.out.println(id+" : "+name+" : "+subject+" : "+marks);
	       }
	       
		
		
		
		
		
	}

}
