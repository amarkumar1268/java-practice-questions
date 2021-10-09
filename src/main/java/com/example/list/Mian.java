package com.example.list;

public class Mian implements Runnable{
	
	String str1,str2;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++)
		{
			str1="welcome to";
			str2="java";
			System.out.println(str1+ " "+str2);
		}
		
	}
	
	public static void main(String args[])
	{
		Mian run=new Mian();
		Thread obj1=new Thread(run);
		Thread obj2=new Thread();
		obj1.start();
		obj2.run();

	}
	

}
