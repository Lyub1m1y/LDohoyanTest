package ru.ldokhoyan;

import static org.junit.Assert.*;

import org.junit.*;

public class BinToDecTest {

	@Test
	//when we enter a binary number, we have to get it in decimal String form
	public void binToDecTest() {
		String str1 = "13";
		String str2 = BinaryToDecimal.binToDec(1101);
		assertEquals(str1, str2);
	}

}
