package com.cts.training5;

public class ThreadTwoResource implements Runnable {

	Resource resource;
	
	public ThreadTwoResource(Resource resource) {
		this.resource=resource;
	}
	
	@Override
	public void run() {
		try {
			resource.display("Thread-2");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
