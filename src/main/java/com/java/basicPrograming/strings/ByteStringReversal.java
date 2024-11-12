package com.java.basicPrograming.strings;

public class ByteStringReversal {

	public static void main(String[] args) {
		String str = "Pallavi";
		
		byte[] stringAsByteArray = str.getBytes();
		byte[] reversed = new byte[stringAsByteArray.length];
		
		for(int i =0; i<stringAsByteArray.length; i++) {
			reversed[i] = stringAsByteArray[stringAsByteArray.length-i-1];
		}
		System.out.println(new String(reversed));

	}

}
