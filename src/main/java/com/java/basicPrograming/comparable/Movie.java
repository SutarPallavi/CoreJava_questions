package com.java.basicPrograming.comparable;

public class Movie implements Comparable<Movie> {

	private double raiting; 
	private String name;
	private int year;
	
	public Movie(double raiting, String name, int year) {
		super();
		this.raiting = raiting;
		this.name = name;
		this.year = year;
	}

	public double getRaiting() {
		return raiting;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	@Override
	public int compareTo(Movie m) {
		
		return this.year - m.year; 
	} 
	
		
}
