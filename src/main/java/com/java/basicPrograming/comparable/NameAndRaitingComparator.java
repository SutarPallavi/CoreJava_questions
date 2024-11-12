package com.java.basicPrograming.comparable;

import java.util.Comparator;

public class NameAndRaitingComparator implements Comparator<Movie>{

	@Override
	public int compare(Movie m1, Movie m2) {
		int compare = m1.getName().compareTo(m2.getName());
		if(compare == 0) {
			if(m1.getRaiting()< m2.getRaiting())
				compare =-1; 
			if(m1.getRaiting() > m2.getRaiting())
				compare = 1; 			
			else compare = 0;
		}		
		return compare;
	}

}
