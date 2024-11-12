package com.java.basicPrograming.singletoneexamples;

class SingletonTest{
	private static SingletonTest singletonTest = null;
	private SingletonTest(){}
	
	public static SingletonTest getInstance() {
		if(singletonTest == null) {
			singletonTest = new SingletonTest();
		}
		return singletonTest;
	}
}
public class SingletonExample {

	public static void main(String[] args) {
		
		SingletonTest x = SingletonTest.getInstance();
		SingletonTest y = SingletonTest.getInstance();
		SingletonTest z = SingletonTest.getInstance();
		
		System.out.println("Hashcode: " + x.hashCode());
		System.out.println("Hashcode: " + y.hashCode());
		System.out.println("Hashcode: " + z.hashCode());
		
		if(x == y && y == z) {
			System.out.println("Three objects point to the same memory location");
		}
		else {
			System.out.println("Three objects Do Not point to the same memory location on the heap ");
		}
	}
}
