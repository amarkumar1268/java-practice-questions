package com.example.concurrency;

public class Synchronization {

    synchronized static void m1() throws InterruptedException {
        System.out.println("m1");
        Thread.sleep(5000);
    }

    synchronized void m2() throws InterruptedException
    {
        System.out.println("m1");

    }

    public static void main(String[] args){
        Synchronization synchronization=new Synchronization();

        //Synchronization synchronization1=new Synchronization();


        Runnable t1= () -> {
            try {
                m1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };


        Runnable t2= () -> {
            try {
                synchronization.m2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        new Thread(t1).start();
        new Thread(t2).start();
    }

}
