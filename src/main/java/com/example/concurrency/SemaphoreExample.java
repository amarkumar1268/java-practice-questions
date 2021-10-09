 package com.example.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreExample {
	
	public static void main(String args[]) throws InterruptedException
	{
		ExecutorService service=Executors.newFixedThreadPool(10);
		Semaphore sm=new Semaphore(3);
		
		for(int i=0;i<10;i++)
			service.submit(new Task(sm));
		
		service.shutdown();
		service.awaitTermination(1, TimeUnit.MINUTES);
	}
}

class Task implements Runnable{

	Semaphore sm;
	
	Task(Semaphore sm){
	this.sm=sm;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		sm.acquireUninterruptibly();
		for(int i=0;i<100;i++)
			System.out.println(Thread.currentThread().getName()+": "+i);
		
		sm.release();
	}
	
}