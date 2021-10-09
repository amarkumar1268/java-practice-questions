package com.example.list;

public class Employee {

	public int id;
	public String name;
	public String compName;
	
	public Employee(int id,String name, String compName)
	{
		this.id=id;
		this.name=name;
		this.compName=compName;		
	}
	
	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
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
	
	public String toString()
	{
		return "Employee ["+this.id+" "+this.name+" "+this.compName+"]";
	}
	
	
}
