package com.java.basicPrograming.failFastExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastExample {

	public static void main(String[] args) {
		Map<String, String> cityCode = new HashMap<>();
		cityCode.put("Delhi", "India");
		cityCode.put("Moscow", "Russia");
		cityCode.put("New York", "US");
		Iterator iterator = cityCode.keySet().iterator();
		
		while(iterator.hasNext()) {
			System.out.println(cityCode.get(iterator.next()));
			cityCode.put("Istanbul", "Turkey");
		}
		
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
