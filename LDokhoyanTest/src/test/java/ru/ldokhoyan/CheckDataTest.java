package ru.ldokhoyan;

import static org.junit.Assert.*;

import org.junit.*;

public class CheckDataTest {

	CheckData check = new CheckData();
	@Test
	//when a binary number is entered correctly, it should return "true"
	public  void correctEnterTest() {
		boolean b = check.checkBinary(1010);
		assertEquals(true, b);
	}
	
	@Test
	//when a binary number is entered correctly, it should return "true"
	public  void uncorrectEnterTest() {
		boolean b = check.checkBinary(2395);
		assertEquals(false, b);
	}

	/*@Test
	//when receives the option number, it should return the desired option
	public void checkOptionTest() {
		//when running the test, enter option 3 in the console
		String str = check.checkOption();
		assertEquals(BinaryToDecimal.binToDec(1010), str);
	}
	*/
}
