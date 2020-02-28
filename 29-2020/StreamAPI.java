package com.cts.training27;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();

		addNames(names);
		// System.out.println(names);

		// 1. Print names with length more than 6

		List<String> nameList = names.stream().filter(s -> s.length() > 6).collect(Collectors.toList());
		System.out.println("*******Names with length greater than 6*******");
		nameList.forEach(System.out::println);

		// 2. Names in upper case
		List<String> namesInUpper = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("*******Names in upper case********");
		namesInUpper.forEach(System.out::println);

		long count = names.stream().count();
		System.out.println("List Count is:" + count);

		Stream<Integer> data = Stream.of(1, 11, 111, 1111, 11111);
		System.out.println("Data count:" + data.count());

		Stream<String> languages = Stream.of("C", "C++", "java", "Python", "Angular");

		//List<String> myList = languages.filter(s -> s.length() > 4).collect(Collectors.toList());
		//System.out.println("*******Names with length greater than 4*******");
		//myList.forEach(System.out::println);

		List<String> add2 = languages.map(s -> s.concat(" Programming")).collect(Collectors.toList());
        add2.forEach(System.out::println);
        
        
        
        //3. Sorting
        List<String> defaltsorting = names.stream().sorted().collect(Collectors.toList());        
        System.out.println("******Default sorting*******");
        defaltsorting.forEach(System.out::println);
        
        List<String> customsorting =  names.stream().sorted((s1,s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println("******Descending sorting*******");
        customsorting.forEach(System.out::println);
        

	}

	private static void addNames(ArrayList<String> names) {
		names.add("Neeraj");
		names.add("Harshita");
		names.add("Rajshree");
		names.add("pulkit");
		names.add("Abhishekh");
		names.add("Mayuresh");
	}
}
