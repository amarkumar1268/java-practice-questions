package com.example.cloning;

class Department{
	String empId;
	String deptName;
	String grade;
	
	Department(String a,String b,String c)
	{
		this.empId=a;
		this.deptName=b;
		this.grade=c;
	}
}

class Employee implements Cloneable{
	
	String name;
	int age;
	int salary;
	Department dept;
	
	Employee(String a,int b, int c,Department dept)
	{
		this.name=a;
		this.age=b;
		this.salary=c;
		this.dept=dept;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", dept=" + dept.empId +", deptname="+dept.deptName+", grade="+dept.grade+ "]";
	}
	
	
}


public class ShallowCloning {
	
   public static void main(String args[]) throws CloneNotSupportedException
   {
	   Department dept=new Department("123","physics","A");
	   Employee emp1=new Employee("amar",26,20000,dept);
	   
	   Employee emp2=(Employee) emp1.clone(); 
	   System.out.println(emp1);
	   emp2.dept.deptName="ghonchu";
	   
	   System.out.println(emp1);
		System.out.println(emp2);
   }
}
