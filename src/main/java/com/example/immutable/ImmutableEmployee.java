package com.example.immutable;

public final class ImmutableEmployee {
	
	private final String name;
	private final int age;
	private final int salary;
	private final Address address;
	
	public ImmutableEmployee(String name, int age, int salary, Address address)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
        this.address=address;
    }
	
	public String getName() {
		return name;
	}
	
	public int getAge() { 
		return age;
	}

	public int getSalary() {
		return salary;
	}
	
	public Address getAddress() {
		
		Address add=new Address();
		add.setVill(this.address.getVill());
		add.setPost(this.address.getPost());
		add.setPincode(this.address.getPincode());
		return add;
	}

	@Override
	public String toString() {
		return "ImmutableEmployee [name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address.getVill()+", post="+
	address.getPost()+", pincode="+address.getPincode()+"]";
	}
  
	
	
}
