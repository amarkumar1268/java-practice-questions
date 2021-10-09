package com.example.concurrency;

public class MultipleWaysCreateThread extends Thread {

	public static void main(String args[]) {
		MultipleWaysCreateThread1 t1 = new MultipleWaysCreateThread1();
		t1.start();
		MultipleWaysCreateThread2 t = new MultipleWaysCreateThread2();
		Thread t2 = new Thread(t);
		t2.start();
	}
}

class MultipleWaysCreateThread1 extends Thread {

	public void run() {
		System.out.println("hello Thread");
	}
}

class MultipleWaysCreateThread2 implements Runnable {

	public void run() {
		System.out.println("hello Runnable");
	}
}
