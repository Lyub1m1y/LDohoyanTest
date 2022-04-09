package ru.ldokhoyan;

import static org.junit.Assert.*;

import org.junit.*;

public class DecToHexTest {

	@Test
	//when we enter a decimal number, we have to get it in hexadecimal String form
	public void decToHexTest() {
		String str1 = "1C82";
		String str2 = DecimalToHex.decToHex(7298);
		assertEquals(str1, str2);
	}

}
