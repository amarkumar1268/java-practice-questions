package com.example.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExample {
	
	public static void main(String args[]) throws InterruptedException, BrokenBarrierException
	{
		ExecutorService service=Executors.newFixedThreadPool(10);
		CyclicBarrier barrier=new CyclicBarrier(3);
		service.execute(new CyclicTask(barrier));
		service.execute(new CyclicTask(barrier));
		service.execute(new CyclicTask(barrier));
		
		//barrier.await();
		System.out.println("barrier completed");
		service.shutdown();
	}

}

class CyclicTask implements Runnable
{
    CyclicBarrier barrier;
    
    CyclicTask(CyclicBarrier barrier)
    {
    	this.barrier=barrier;
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName()+" arrived");
		try {
			barrier.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<10;i++)
			System.out.println(Thread.currentThread().getName()+": "+i);
	}
	
}

