 package com.java.basicPrograming.executorServiceDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

	public static void main(String [] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		for(int i =0; i<10; i++) {
			Runnable worker = new WorkerThread("" + i);
			executorService.execute(worker);
		}
		
		executorService.shutdown();
		while(!executorService.isTerminated()) {}
		System.out.println("Finished all threads");
	}

}
