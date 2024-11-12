package com.java.basicPrograming.comparable;

import java.util.Comparator;

public class RaitingCompare implements Comparator<Movie>{

	@Override
	public int compare(Movie m1, Movie m2) {
		if(m1.getRaiting()< m2.getRaiting())
			return -1; 
		if(m1.getRaiting() > m2.getRaiting())
			return 1; 
		if(m1.getRaiting()== m2.getRaiting())
			return m1.getName().compareTo(m2.getName());
		else return 0;		
	}

}
