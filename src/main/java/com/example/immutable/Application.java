package com.example.immutable;

public class Application {

	public static void main(String args[]) 
	{
		Address add=new Address("mtd","jmp",811214);
		ImmutableEmployee imemp=new ImmutableEmployee("amar",26,20000,add);
		
		System.out.println(imemp.getAddress());		
		imemp.getAddress().setVill("phulka");	
		imemp.getAddress().setPost("mng");
		imemp.getAddress().setPincode(12345);
		System.out.println(imemp.getAddress());		
	}
}
