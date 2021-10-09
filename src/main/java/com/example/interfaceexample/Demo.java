package com.example.interfaceexample;

public interface Demo {
	
    int a=10;
	default void method() {
		
	}

	public void printA();
	default void printD()
	{
		System.out.println("hello D");
	}
		
}
