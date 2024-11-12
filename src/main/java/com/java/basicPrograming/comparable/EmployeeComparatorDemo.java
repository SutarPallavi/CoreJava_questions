package com.java.basicPrograming.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparatorDemo {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("ABC", 2, "D"));
		empList.add(new Employee("A", 1, "B"));
		empList.add(new Employee("HIJ", 3, "C"));
		empList.add(new Employee("A", 0, "A"));
		
		Collections.sort(empList);
		System.out.println("Sorted list");
		empList.stream()
		.forEach(e -> System.out.println(e.getName()+":"+e.getId()+":"+e.getDomain()));
		
		Collections.sort(empList, new EmployeeDomainCompare());
		System.out.println("Sorted List by Domain");
		empList.stream()
		.forEach(e -> System.out.println(e.getName()+ ":"+e.getId()+":"+e.getDomain()));
		
		Collections.sort(empList, new EmployeeNameCompare());
		System.out.println("Sorted List By Name");
		empList.stream()
		.forEach(e -> System.out.println(e.getName()+ ":"+e.getId()+":"+e.getDomain()));
		
		Collections.sort(empList, new EmployeeNameAndDomainCompare());
		System.out.println("Sorted by Name and domain");
		empList.stream()
		.forEach(e -> System.out.println(e.getName()+ ":"+e.getId()+":"+e.getDomain()));
	}
}
