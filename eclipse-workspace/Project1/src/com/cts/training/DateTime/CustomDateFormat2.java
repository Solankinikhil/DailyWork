package com.cts.training.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CustomDateFormat2 {

	public static void main(String[] args) {
	
		LocalDate arrival=LocalDate.now();
		try
		{
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMM dd yyyy");
			String comming=arrival.format(formatter);
			System.out.printf("The Date %s is formatted in %s %n",arrival,comming);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
