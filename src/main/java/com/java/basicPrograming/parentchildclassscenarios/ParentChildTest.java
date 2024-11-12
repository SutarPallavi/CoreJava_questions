package com.java.basicPrograming.parentchildclassscenarios;

public class ParentChildTest {

	public static void main(String[] args) {
		Employee emp = new EmployeeChild(1, "Pallavi", 26, 29);
		test(emp); 
	}
	
	private static void test(Employee emp) {
		System.out.println(emp);
		
	}
}
