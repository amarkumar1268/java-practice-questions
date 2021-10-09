package com.example.misc;

public class Ploymorphism {
	
	public void method1()
	{
		System.out.println("in parent");
	}
	
	public static void method2()
	{
		System.out.println("in parent static");
	}
	
	public static void main(String ags[])
	{
		Ploymorphism p=new Ploymorphism();
		Ploymorphism upcasting=new Child();
		Child c=new Child();
		Child c1=(Child)upcasting;
		
		p.method1();
		upcasting.method1();
		c.method1();
		c1.method1();
		
		p.method2();
		upcasting.method2();
		c.method2();
		c1.method2();
	}

}
class Child extends Ploymorphism
{
	public void method1()
	{
		System.out.println("in child");
	}
	
	public static void method2()
	{
		System.out.println("in child static");
	}

}