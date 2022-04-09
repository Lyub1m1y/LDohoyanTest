package ru.ldokhoyan;

import java.util.*;

//10 -> 2
public class DecimalToBinary {

	public static String decToBin(int dec) {
		int temp = dec;
		int mod;
		String str = null;
		//ñreating a Deque to store the remainder
		Deque<Integer> stack = new LinkedList<>();
		StringBuilder binBuilder = new StringBuilder();
		do {
			//get remains
			mod = temp % 2;
			stack.push(mod);
			//get quotient
			temp = temp / 2;
		} while (temp > 0);

		while (!stack.isEmpty()) {	
			str = String.valueOf(stack.pop());
			binBuilder.append(str);
		}
		
		return binBuilder.toString();

	}

}
