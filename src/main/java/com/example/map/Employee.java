package com.example.map;

public class Employee {
	
	int id;
	String name;
	String email;
	
	Employee(int id,String name, String email)
	{
		this.id=id;
		this.name=name;
		this.email=email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int hashcode()
	{
		return this.id;
	}
	public boolean equals(Employee e)
	{
		return (this.id==e.id && this.name.equals(e.name) && this.email.equals(e.email));
	}
	
	public String toString()
	{
		return "Employee ["+this.id+" "+this.name+" "+this.email+"]";
	}

}
