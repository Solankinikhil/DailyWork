package com.cts.myservelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/greet")
public class GretingServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter pw = resp.getWriter();

		String userName = req.getParameter("un");
		String password = req.getParameter("pwd");
		System.out.println("Welcome " + userName);

		if (password.equals("Solanki")) {
			pw.write("<h1>Welcome " + userName + "</h1>");
			System.out.println("Welcome " + userName);
		} else {
			System.out.println("Wrong");
		}
		
	}
}
