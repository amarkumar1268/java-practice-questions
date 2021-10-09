package com.example.singleton;

import java.io.Serializable;

public class  SingletonEmployee implements Cloneable, Serializable {
	
	private volatile static SingletonEmployee INSTANCE;
	private String name;
	private int age;
	private int empid;	
	private Address addr;
		
	private SingletonEmployee()
	{
		this.name="amar";
		this.age=26;
		this.empid=121;
		this.addr=new Address("1234","addr",110011);
	}
	
	
	protected Object readResolve(){
		return INSTANCE;
	}
	
	@Override
	protected Object clone()
	{
		return INSTANCE;
	}
	
	public static SingletonEmployee getInstance()
	{
		if(INSTANCE==null)
		{
			synchronized(SingletonEmployee.class) {
			if(INSTANCE==null)
				INSTANCE=new SingletonEmployee();
			}
		}
		return INSTANCE;
	}

	public SingletonEmployee getINSTANCE() {
		return INSTANCE;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getEmpid() {
		return empid;
	}

	@Override
	public String toString() {
		return "SingletonEmployee [name=" + name + ", age=" + age + ", empid=" + empid + ", addr=" + addr.getHno() + ", town="+addr.getTown()+", pincode="+addr.getPincode()+"]";
	}

	
	
}
