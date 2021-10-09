package com.example.interfaceexample;

public class DemoImpl implements Demo{
	static int a=11;

	@Override
	public void printA() {
		// TODO Auto-generated method stub
		System.out.println("hello A");
	}
	
	
	public void printD() {
		// TODO Auto-generated method stub
		System.out.println("hello A in class "+a);
	}
	
	void a(int a)
	{
		System.out.println("integrer");
	}
	void a(Long a)
	{
		System.out.println("long");
	}
	void a(short a)
	{
		System.out.println("short");
	}
	
	void a(double a)
	{
		System.out.println("double");
	}
	void a(float a)
	{
		System.out.println("float");
	}
	void a(char a)
	{
		System.out.println("char");
	}
	
	
	
	void b(Object b)
	{
		System.out.println("object");
	}
	void b(String s)
	{
		System.out.println("string");
	}
	
    public void m1(float i,int j){
        System.out.println("float method ");
    }

    public void m1(int i, float j){
        System.out.println("int method ");
    }

	
	public static void m()
	{
		int a=10;
	}
	public static void main(String args[])
	{
		DemoImpl d= new DemoImpl(); 
		//d.printA();
		//d.printD();		
		Demo d1=new DemoImpl();
		//d1.printD();		
		d.a(1);
		d.b(null);
		
		String a="abc";
		String b=new String("abc");
		
		System.out.println(a.equals(b));
		
		//d.m1(10,10);
	} 
}
