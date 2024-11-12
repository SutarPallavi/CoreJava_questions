package com.java.basicPrograming.comparable;

import java.util.Comparator;

public class EmployeeDomainCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getDomain().compareTo(o2.getDomain());
	}

}
