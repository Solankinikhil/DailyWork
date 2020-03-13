package com.cts.training.DateTime;

import java.time.LocalTime;

public class TodayTime {

	public static void main(String[] args) {
		
		LocalTime current=LocalTime.now();
		System.out.println("Current time is :"+current);
	}
}

