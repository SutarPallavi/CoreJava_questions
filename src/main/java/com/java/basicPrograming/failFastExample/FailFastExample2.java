package com.java.basicPrograming.failFastExample;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastExample2 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        Iterator<Integer> itr = al.iterator();
        while(itr.hasNext()) {
        	if(itr.next()==2) {
        		itr.remove();
        	}
        }
        System.out.println(al);
        itr = al.iterator();
        while(itr.hasNext()) {
        	if(itr.next()==3) {
        		al.remove(3);
        	}
        }
	}

}
