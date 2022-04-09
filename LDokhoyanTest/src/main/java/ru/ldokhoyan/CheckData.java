package ru.ldokhoyan;

public class CheckData {
	//get an option and return the result of the operation
	public static String checkOption() {
		final int opt = InputData.option();
		switch (opt) {
		case 1:
			return DecimalToHex.decToHex(InputData.number());
		case 2:
			return DecimalToBinary.decToBin(InputData.number());
		case 3:
			return BinaryToDecimal.binToDec(InputData.number());
		}
		return "Ошибка! :(";
	}

	//checking a number for belonging to a binary number system
	public static boolean checkBinary(int num) {
		int temp = num;
		if ((temp == 0 || temp == 1 || temp < 0) && (temp > 1 || temp < 0) ) {
			return false;
		}
		while (temp != 0) {
			if (temp % 10 > 1) {
				return false;
			}
			temp = temp / 10;
		}
		return true;
	}
}
