package com.example.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Application {
	
	static Employee e1,e2,e3,e4,e5,e6,e7;
	
	public Application()
	{
		 e1=new Employee(1,"amar","Agnity");
		 e2=new Employee(10,"zmar","Agnity");
		 e3=new Employee(4,"kmar","Agnity");
		 e4=new Employee(12,"cmar","Agnity");
		 e5=new Employee(19,"omar","Agnity");
		 e6=new Employee(8,"gmar","Agnity");
		 e7=new Employee(17,"bmar","Agnity");
	}
	
	public void comparator()
	{
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(e1);al.add(e7);al.add(e6);al.add(e5);al.add(e4);al.add(e3);al.add(e2);
		
		System.out.println("list before sorting");
		al.forEach((n) -> System.out.println(n));
		
		Collections.sort(al,new EmloyeeComparatorId());
		System.out.println("list after sorting on id basis");
		al.forEach((n) -> System.out.println(n));

		Collections.sort(al,new EmployeeComparatorName());
		System.out.println("list after sorting on name basis");
		al.forEach((n) -> System.out.println(n));	
	}
	
	public static void main(String args[]) throws InterruptedException
	{
		Application app=new Application();
		app.comparator();
		
		System.out.println("map iteration");

		Map<String, Integer> items = new HashMap<>();
        items.put("coins", 5);
        items.put("pens", 2); 
        items.put("chairs", 7);

        items.forEach((k, v) -> {
            System.out.println("key:"+k+", value:"+v);
        });
        
        System.out.println(Math.round(-7.5));
        System.out.println(Math.abs(-7.5));
        
        int x=25;
        try {
        	run(x++);
        	return;
        	
        }
        finally {
        	x++;
        	System.out.println(x);
        }

	}
	
	public static void run(int x)
	{
	  ++x;
	  x++;
	}

}
