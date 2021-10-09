package com.example.cloning;

class Department1 implements Cloneable{
	
	String deptname;
	int deptId;
	
	Department1(String a,int b)
	{
		this.deptname=a;
		this.deptId=b;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

class Employee1 implements Cloneable{
	
	String empname;
	int empId;
	int salary;
	Department1 dept;
	
	Employee1(String a, int b,int c, Department1 dept)
	{
		this.empname=a;
		this.empId=b;
		this.salary=c;
		this.dept=dept;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		Employee1 emp=(Employee1)super.clone();
		emp.dept=(Department1)dept.clone();
		return emp;
	}

	@Override
	public String toString() {
		return "Employee1 [empname=" + empname + ", empId=" + empId + ", salary=" + salary + ", dept=" + dept.deptname +", deptId="+dept.deptId+ "]";
	}
	
}


public class DeepCloning {
	
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Department1 dept=new Department1("abc",123);
		Employee1 emp1=new Employee1("def",321,345,dept);
		
		Employee1 emp2=(Employee1) emp1.clone();
		System.out.println(emp1);
		emp2.dept.deptname="amar";
		System.out.println(emp1);
		System.out.println(emp2);
		
	}

}
