package com.example.concurrency;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {
	
	public static void main(String args[]) throws InterruptedException
	{		
		ExecutorService service=Executors.newFixedThreadPool(10);
		CountDownLatch latch=new CountDownLatch(3);
		service.execute(new NewTask(latch));
		service.execute(new NewTask(latch));
		service.execute(new NewTask(latch));
		
		latch.await();
		System.out.println("all dependednt service excuted");		
		service.shutdown();
	}
}

class NewTask implements Runnable
{
	CountDownLatch latch;
	NewTask(CountDownLatch latch)
	{
		this.latch=latch;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<100;i++)
			System.out.println(Thread.currentThread().getName());
		latch.countDown();
	}
	
}