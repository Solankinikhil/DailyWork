package com.cts.training5;

public class ThreadOneResource implements Runnable {

	Resource resource;
	
	public ThreadOneResource(Resource resource) {
		this.resource=resource;
	}
	
	@Override
	public void run() {
		try {
			resource.display("Thread-1");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
