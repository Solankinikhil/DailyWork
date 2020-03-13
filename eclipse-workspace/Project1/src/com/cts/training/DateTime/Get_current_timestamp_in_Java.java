package com.cts.training.DateTime;

import java.time.Instant;

public class Get_current_timestamp_in_Java 
{

	public static void main(String[] args) {
		
		Instant instant=Instant.now();
		System.out.println("The Current timestamp is :"+instant);

	}
}


