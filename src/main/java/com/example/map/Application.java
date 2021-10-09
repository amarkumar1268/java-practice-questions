package com.example.map;

import java.util.HashMap;
import java.util.Map;

public class Application {

	public static void main(String args[])
	{
		Map<Employee,String> map=new HashMap<Employee,String>();
		
		Employee e1=new Employee(1,"amar","abcd@com");
		Employee e2=new Employee(4,"cdhr","hdj@com");
		Employee e4=new Employee(5,"zxcf","qsj@com");
		Employee e5=new Employee(6,"tfg","okf@com");
		Employee e6=new Employee(7,"ioah","vbg@com");
		
		map.put(e1, "emp1");
		map.put(e2, "emp2");
		map.put(e4, "emp4");
		map.put(e5, "emp5");
		map.put(e6, "emp1");
		
		map.forEach((k,v) -> System.out.println(k+": "+v));
	}
}
