package com.java.basicPrograming.comparable;

public class Employee implements Comparable<Employee> {

	private String name;
	private int id;
	private String domain;
	
	
	public Employee(String name, int id, String domain) {
		super();
		this.name = name;
		this.id = id;
		this.domain = domain;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDomain() {
		return domain;
	}


	public void setDomain(String domain) {
		this.domain = domain;
	}

	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", domain=" + domain + "]";
	}


	@Override
	public int compareTo(Employee e) {
		return this.id-e.id;
	}
	
	
}
