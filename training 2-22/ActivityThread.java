package com.cts.training5;

public class ActivityThread {

	public static void main(String[] args) {
		Runnable r = new Thread1();
		Thread t = new Thread(r);

		Runnable r2 = new Thread2();
		Thread t2 = new Thread(r2);

		t.start();
		t2.start();

	}

}
