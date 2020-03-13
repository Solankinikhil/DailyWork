package com.cts.training.DateTime;

import java.time.LocalDate;

public class DateIsBeforeOrAfteranotherDate {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		
		LocalDate tommorow=LocalDate.of(2016, 8, 20);
		if(today.isBefore(tommorow))
		{
			System.out.println("TRUE");
		}
		if(today.isAfter(tommorow))
		{
			System.out.println("TRUE");
		}
	}

}