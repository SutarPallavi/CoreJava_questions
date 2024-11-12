package com.java.basicPrograming.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(new Movie(5.9, "DTPH", 1999)); 
		movieList.add(new Movie(7.8, "ABCD", 1990));
		movieList.add(new Movie(7.7, "xyz", 2000));
		movieList.add(new Movie(9.9, "sdf", 2012));
		movieList.add(new Movie(9.7, "sdf", 2008));
		movieList.add(new Movie(6.5, "wert", 2023));
		
		Collections.sort(movieList);
		System.out.println("Movie list after sorting");
		
		for(Movie m : movieList) {
			System.out.println(m.getRaiting() + " "+m.getName() + " "+m.getYear());
		}
		
		System.out.println("List after sorted by name");
		NameCompare nameCompare = new NameCompare(); 
		Collections.sort(movieList, nameCompare);
		for(Movie m : movieList) {
			System.out.println(m.getRaiting() + " "+m.getName() + " "+m.getYear());
		}
		
		System.out.println("List after sorted by raiting");
		RaitingCompare raitingCompare = new RaitingCompare(); 
		Collections.sort(movieList, raitingCompare);
		
		for(Movie m : movieList) {
			System.out.println(m.getRaiting() + " "+m.getName() + " "+m.getYear());
		}
		
		System.out.println("List after sorting by Name and raiting");
		
		NameAndRaitingComparator nameAndRaitingComparator = new NameAndRaitingComparator();
		Collections.sort(movieList, nameAndRaitingComparator);
		
		for(Movie m : movieList) {
			System.out.println(m.getRaiting() + " "+m.getName() + " "+m.getYear());
		}
		
	}

}
