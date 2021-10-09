package com.example.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExample {

	public static void main(String args[]) throws InterruptedException, ExecutionException {
	ExecutorService service=Executors.newFixedThreadPool(5);
	for(int i=0;i<10;i++)
	{
		service.submit(new Task());
	}
	
	List<Integer> lf=new ArrayList<Integer>();
	for(int i=0;i<10;i++)
	{
		Future<Integer> f=service.submit(new CallTask());
		lf.add(f.get());
	}
	
	for(Integer ft:lf)
	{
		System.out.println(ft);
	}
}
}

class Task implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
}


class CallTask implements Callable<Integer>
{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return 1;
	}
}
