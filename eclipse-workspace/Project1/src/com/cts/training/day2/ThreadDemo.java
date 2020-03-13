package com.cts.training.day2;

import java.io.FileReader;
import java.io.IOException;

public class ThreadDemo {

	public void readData() throws IOException {
		FileReader fr = new FileReader("empData.txt");
		int i = fr.read();
		System.out.println("hi " + i);
	}

	public void task2() throws IOException {
		readData();
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ThreadDemo demo4 = new ThreadDemo();
		try {
			demo4.task2();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of main");
	}

}
