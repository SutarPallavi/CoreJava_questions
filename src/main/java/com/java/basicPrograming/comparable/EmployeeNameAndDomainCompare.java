package com.java.basicPrograming.comparable;

import java.util.Comparator;

public class EmployeeNameAndDomainCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int compare = o1.getName().compareTo(o2.getName());
		if(compare == 0) {
			return o1.getDomain().compareTo(o2.getDomain());
		}
		return 0;
	}

}
