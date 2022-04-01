package com.example.list;

import java.util.Comparator;

public class EmloyeeComparatorId implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		
		/*if(e1.id==e2.id)
		    return 0;
		else if(e1.id>e2.id)
			return 1;
		else
			return -1;*/

		return e1.id-e2.id;
	}

	
}
