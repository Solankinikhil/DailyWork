package com.cts.training5;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		int n = 4;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Table for 4: " + n * i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

		
	}

}
