package com.example.exception;


class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}
public class CustomException {
	
	public void findage(int age)
	{
		try {
			if(age<18)
				throw new InvalidAgeException("age must be greater than 18");
			else
				System.out.println("your age is "+age);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String args[])
	{
		CustomException ce=new CustomException();
		ce.findage(16);
	}
}
