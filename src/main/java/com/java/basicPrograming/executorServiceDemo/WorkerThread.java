package com.java.basicPrograming.executorServiceDemo;

public class WorkerThread implements Runnable{

	private String command; 
	
	public WorkerThread (String s) {
		this.command = s; 
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Starts. Command = " + command);
		processCommand();
		System.out.println(Thread.currentThread().getName() + " End.");
		
	}
	private void processCommand() {
		try {
			Thread.sleep(5000);
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
		
	}

	
}
