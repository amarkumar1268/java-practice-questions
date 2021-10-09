package com.example.concurrency;

import java.util.LinkedList;

public class ProducerConsumer {
	
	LinkedList<Integer> l=new LinkedList<Integer>();
	int limit=10;
	int i=0;
	
	synchronized void produce() throws InterruptedException
	{
		while(true) {
		if(l.size()==limit)
			wait();
		
		System.out.println("prodecer produced "+i);
		l.add(i++);
		
		notify();
		Thread.sleep(1000);
		}
	}
	
	synchronized void consume() throws InterruptedException
	{
		while(true) {
		if(l.size()==0)
			wait();
		
			System.out.println("consumer consumed "+l.removeFirst());
		
		notify();
		Thread.sleep(1000);
		}

	}	
	
	public static void main(String args[])
	{
		ProducerConsumer pc=new ProducerConsumer();
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		t1.start();
		t2.start();
	}

}


