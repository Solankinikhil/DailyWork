package com.cts.training.day2;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set set = new TreeSet();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");

		System.out.println(set);
		System.out.println("end of main");

	}

}
