package com.java.basicPrograming.failsafeexamples;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>
		(new Integer[] { 1, 3, 5, 8 });
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			 Integer no = (Integer)itr.next();
	         System.out.print(no + " ");
	         if(no == 5) {
	        	 list.add(14);
	         } 
		}
	}

}
