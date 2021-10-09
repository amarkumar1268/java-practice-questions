package com.example.misc;

public class ExcelColumn {
	
	
	public void findColumn(int columnNumber)
	{
		int column=columnNumber;
		int x=column/26;
		int y=column%26;
		String s="";
		
		for(int i=0;i<x;i++)
			s=s+'a';
		
		char c= (char) (97+y);		
		s=s+c;
		System.out.println(s.toUpperCase());
	}
	
	public static void main(String args[])
	{
		ExcelColumn exc=new ExcelColumn();
		exc.findColumn(265);
	}

}
