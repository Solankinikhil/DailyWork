package com.cts.myservelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {

public void init() throws ServletException {
	
	// TODO Auto-generated method stub
	System.out.println("from init---- it will run only once--always");
}
@Override
	protected void service(HttpServletRequest req, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
	System.out.println("from service---- it will run only once--always");

	}
@Override
	public void destroy() {
		// TODO Auto-generated method stub
	System.out.println("from destroy---- it will run only once--always");

	}
}
