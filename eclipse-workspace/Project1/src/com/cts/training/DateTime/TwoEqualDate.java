package com.cts.training.DateTime;

import java.time.LocalDate;

public class TwoEqualDate {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		LocalDate birthday=LocalDate.of(2020, 02, 29);
		
		if(birthday.equals(today))
		{
			System.out.printf("Today %s and birthday %s are same dates %n",today,birthday);
		}
		else
		{
			System.out.println("Dates are not Equal");
		}
	}}