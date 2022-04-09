package ru.ldokhoyan;
//10 -> 16
public class DecimalToHex {
	private static final int sizeOfIntInHalfBytes = 4;//since the maximum that can be output to the console is 2710
	private static final int numberOfBitsInAHalfByte = 4;
	private static final int halfByte = 0x0F;
	private static final char[] hexDigits = {
			'0', '1', '2', '3', '4', '5', '6', '7',
			'8', '9','A', 'B', 'C', 'D', 'E', 'F' 
			};

	public static String decToHex(int dec) {
		//will add a digits to the hexadecimal builder
		StringBuilder hexBuilder = new StringBuilder(sizeOfIntInHalfBytes);
		hexBuilder.setLength(sizeOfIntInHalfBytes);
		for (int i = sizeOfIntInHalfBytes - 1; i >= 0; --i) {
			int j = dec & halfByte;
			hexBuilder.setCharAt(i, hexDigits[j]);
			dec >>= numberOfBitsInAHalfByte;
		}
		return hexBuilder.toString();
	}

}
