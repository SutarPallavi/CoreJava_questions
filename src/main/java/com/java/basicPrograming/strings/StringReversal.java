package com.java.basicPrograming.strings;

public class StringReversal {

	public static void main(String[] args) {
		String str = "Pallavi";
		String nstr = "";
		char ch ;
		
		for(int i =0; i<str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch+ nstr;
		}
		
		System.out.println(nstr);
	}

}
