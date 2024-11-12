package com.java.basicPrograming.parentchildclassscenarios;

public class EmployeeChild extends Employee{
	
	private int number;
	private int age;
	public EmployeeChild(int id, String name, int number, int age) {
		super(id, name);
		this.number = number;
		this.age = age;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "EmployeeChild [number=" + number + ", age=" + age + "]";
	}	
}
