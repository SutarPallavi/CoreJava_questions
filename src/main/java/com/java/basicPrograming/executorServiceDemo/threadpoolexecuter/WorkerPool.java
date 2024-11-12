package com.java.basicPrograming.executorServiceDemo.threadpoolexecuter;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.java.basicPrograming.executorServiceDemo.WorkerThread;

import java.util.concurrent.ArrayBlockingQueue; 
public class WorkerPool {

	public static void main(String[] args) throws InterruptedException {
		RejectedExecutionHandlerImpl rejectionHandler = new RejectedExecutionHandlerImpl(); 
		ThreadFactory threadFactory = Executors.defaultThreadFactory();
		
		ThreadPoolExecutor executorPool = new ThreadPoolExecutor(2, 4, 10, TimeUnit.SECONDS, 
				new ArrayBlockingQueue<Runnable>(2), threadFactory, rejectionHandler);
		MyMonitorThread monitor = new MyMonitorThread(executorPool, 3);
		
		Thread monitorThread = new Thread(monitor);
		
		monitorThread.start();

		for(int i=0; i<5; i++) {
			executorPool.execute(new WorkerThread("cmd"+i));
		}
		
		Thread.sleep(3000);
		executorPool.shutdown();
		Thread.sleep(5000);
		monitor.shutdown();
	}

}
