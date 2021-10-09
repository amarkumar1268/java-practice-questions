package com.example.list;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeComparable implements Comparable<EmployeeComparable> {
	
	public int id;
	public String name;
	
	
	public EmployeeComparable(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * public int compareTo(EmployeeComparable emp1) { // TODO Auto-generated method
	 * stub if(this.id==emp1.id) return 0; if(this.id>emp1.id) return 1; else return
	 * -1; }
	 */
	public int compareTo(EmployeeComparable emp1) {
		// TODO Auto-generated method stub
		if(this.name.equalsIgnoreCase(emp1.name))
			return 0;
		if(this.name.compareToIgnoreCase(emp1.name) > 0)
			return 1;
		else
			return -1;
	}
	
	public String toString()
	{
		return this.id+" "+this.name;		
	}
	
	public static void main(String args[]) {
		
		EmployeeComparable e1=new EmployeeComparable(1,"amar");
		EmployeeComparable e2=new EmployeeComparable(2,"bmar");
		EmployeeComparable e3=new EmployeeComparable(12,"zmar");
		EmployeeComparable e4=new EmployeeComparable(5,"kmar");
		EmployeeComparable e5=new EmployeeComparable(16,"dmar");
		EmployeeComparable e6=new EmployeeComparable(11,"jmar");
		EmployeeComparable e7=new EmployeeComparable(10,"imar");
		
		ArrayList<EmployeeComparable> al=new ArrayList<EmployeeComparable>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		al.add(e7);
		
		System.out.println("list before sorting");
		al.forEach((n) -> System.out.println(n));
		
		Collections.sort(al);
		System.out.println("list after sorting");
		al.forEach((n) -> System.out.println(n));

	}
}
