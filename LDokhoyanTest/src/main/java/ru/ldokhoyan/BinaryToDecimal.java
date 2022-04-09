package ru.ldokhoyan;

//2 -> 10
public class BinaryToDecimal {

	public static String binToDec(int bin) {
		int num = bin;
		// binary check
		while (CheckData.checkBinary(InputData.getNum()) == !true) {
			System.out.println("Ошибка, нужно ввести в двоичной системе счисления!");
			num = InputData.number();
		}
		
		int dec = 0;
		int base = 1;
		int temp = num;
		while (temp > 0) {
			int last_digit = temp % 10;
			temp = temp / 10;
			dec += last_digit * base;
			base = base * 2;
		}
		return String.valueOf(dec);
	}
}
