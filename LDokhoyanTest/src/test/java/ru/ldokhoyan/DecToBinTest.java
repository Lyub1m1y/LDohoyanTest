package ru.ldokhoyan;

import static org.junit.Assert.*;

import org.junit.*;

public class DecToBinTest {

	@Test
	//when we enter a decimal number, we have to get it in binary String form
	public void decToBinTest() {
		String str1 = "101101101000";
		String str2 = DecimalToBinary.decToBin(2920);
		assertEquals(str1, str2);
	}

}
