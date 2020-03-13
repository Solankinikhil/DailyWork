package com.cts.training.DateTime;

import java.time.LocalTime;

public class TodayTimeAddHours{

	public static void main(String[] args) {
		
		LocalTime current=LocalTime.now();
		
		LocalTime newTime=current.plusHours(2);
		System.out.println("New  time is :"+newTime);
	}
}