package com.java.basicPrograming.strings;

public class StringReversalWithoutSpecitalCharactors {

	public static void main(String[] args) {
		String str = "P*a)ll*a&v i";
		
		char[] charArray = str.toCharArray();
		reverseString(charArray);
		String nstr = new String(charArray);
		System.out.println(charArray);
	}

	private static void reverseString(char[] charArray) {
		int r = charArray.length-1, l=0;
		while(l<r) {
			if(!Character.isAlphabetic(charArray[l])) {
				l++;
			}
			else if(!Character.isAlphabetic(charArray[r])) {
				r--;
			}
			else {
				char temp = charArray[l];
				charArray[l]= charArray[r];
				charArray[r] = temp;
				l++;
				r--;
			}
		}
	}

}
