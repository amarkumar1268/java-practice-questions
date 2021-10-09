package com.example.stream;

public class Demo extends Demo11{
	
	public static void main(String args[])
	{
		Demo d=new Demo();
		d.method2();
	}

}

abstract class Demo11{
	
	private void method1() {
		System.out.println("hello");
	}
	
	void method2()
	{
		method1();
	}
}