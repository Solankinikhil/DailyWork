package com.cts.training5;

public class MainThread {

	public static void main(String[] args) {
		
			Thread t=Thread.currentThread();
			System.out.println(t);
			System.out.println(t.getName());
			System.out.println(t.isDaemon());
			System.out.println(t.isAlive());
	}

}
