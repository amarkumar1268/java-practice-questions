package com.example.singleton;

public class Application {
	
	public static void main (String args[])
	{
		SingletonEmployee semp1=SingletonEmployee.getInstance();
		SingletonEmployee semp2=SingletonEmployee.getInstance();
		SingletonEmployee semp3=SingletonEmployee.getInstance();
		SingletonEmployee semp4=SingletonEmployee.getInstance();

		System.out.println(semp1==semp2);
		System.out.println(semp3==semp4);
		System.out.println(semp1==semp3);
		System.out.println(semp1==semp4);
		System.out.println(semp1.toString());
		
		Address addr1=new Address("678","def",789);
		System.out.println(semp1.toString());
			
	}

}
