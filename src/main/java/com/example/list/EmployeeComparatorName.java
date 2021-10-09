package com.example.list;

import java.util.Comparator;

public class EmployeeComparatorName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.compName.equals(o2.name))
			return 0;
		else if(o1.name.compareToIgnoreCase(o2.name)>0)
			return 1;
		else
			return -1;
			
	}

}
