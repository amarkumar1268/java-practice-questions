package com.example.concurrency;

public class JoinMethodExample {
	
	public static void main(String args[]) throws InterruptedException
	{
		Thread t1=new Thread(() ->
		{
			for(int i=0;i<5;i++)
			System.out.println("hi");
		});
		
		Thread t2=new Thread(() ->
		{
			for(int i=0;i<5;i++)
			System.out.println("hello");
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("main");		
	}

}

