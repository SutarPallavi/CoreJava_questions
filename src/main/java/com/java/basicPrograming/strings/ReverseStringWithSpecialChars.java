package com.java.basicPrograming.strings;

public class ReverseStringWithSpecialChars {

	static void reverse(char[] str) {
		int r = str.length-1, l=0;
		while(l<r) {
			if(!Character.isAlphabetic(str[l]))
				l++;
			else if(!Character.isAlphabetic(str[r]))
				r--;
			else {
				char temp = str[l];
				str[l] = str[r];
				str[r] = temp;
				l++;
				r--;
			}
		}
	}
	public static void main(String[] args) {
		
		String str = "P a l l a v i";
		System.out.println(str);
		char[] charArray = str.toCharArray();
		reverse(charArray);
		String revStr = new String (charArray);
		System.out.println(revStr);

	}

}
