package com.example.singleton;

public class StaticClass {
	
	private static final StaticClass INSTANCE=new StaticClass("amar",26);
	private int age;
	private String name;
	
	private StaticClass(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public StaticClass getInstance()
	{
		return INSTANCE;
	}

}
