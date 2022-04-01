package com.example.concurrency;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue {

	  private List queue = new LinkedList();
	  private  int  limit = 10;

	  public BlockingQueue(int limit){
	    this.limit = limit;
	  }


	  @SuppressWarnings("unchecked")
	public synchronized void enqueue(Object item)
	  throws InterruptedException  {
	    while(this.queue.size() == this.limit) {
	      wait();
	    }
	    if(this.queue.size() == 0) {
	      notifyAll();
	    }

	    this.queue.add(item);
	  }


	  public synchronized Object dequeue()
	  throws InterruptedException{
	    while(this.queue.size() == 0){
	      wait();
	    }
	    if(this.queue.size() == this.limit){
	      notifyAll();
	    }

	    return this.queue.remove(0);
	  }
	  
	  public static void main(String args[])
	  {
		  BlockingQueue bq=new BlockingQueue(10);
		  Thread t1=new Thread(new Runnable() {
			  public void run()
			  {
				  try {
					  for(int i=0;i<20;i++)
					bq.enqueue(new String("abc"));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  }
		  });
		  
		  Thread t2=new Thread(new Runnable() {
			  public void run()
			  {
				  try {
					  for(int i=0;i<20;i++)
                    System.out.println("t2 "+bq.dequeue());
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
