package com.incubyte.calculator.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

import com.incubyte.calculator.Calculator;

/**
 * Test class for calculator
 * 
 * @author shishir
 *
 */
public class CalculatorTest {

	/**
	 * Test Method to add two numbers separated by a ,
	 */
	@Test
	public void testAddTwoNumbers() {
		try {
			assertEquals(3, Calculator.add("1,2"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Test Method to add an empty string
	 */
	@Test
	public void testEmptyString() {
		try {
			assertEquals(0, Calculator.add(""));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Test Method check if a number is passed
	 */
	@Test
	public void testSingleNumber() {
		try {
			assertEquals(123, Calculator.add("123"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Test Method to add four numbers separated by a ,
	 */
	@Test
	public void testAddFourNumbers() {
		try {
			assertEquals(14, Calculator.add("1,2\n3, 8"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Method that tests on exception for negative numbers
	 */
	@Test
	public void testThrowExceptionForNegativeNumbers() {
		try {
			Calculator.add("1,-2,3");
			fail("Exception expected");
		} catch (Exception e) {
			System.out.println("Negatives not allowed");
		}
	}

	/**
	 * Test Exception message should have negative number
	 * 
	 * @throws Exception
	 */
	@Test
	public void testHaveNegativeNumbersInException() throws Exception {
		try {
			Calculator.add("-1,-2,3");
			fail("Exception expected");
		} catch (Exception e) {
			assertEquals("negatives not allowed: -1, -2", e.getMessage());
		}
	}

	/**
	 * Allow custom delimiter by checking // in beginning of first line
	 */
	@Test
	public void testAllowCustomDelimiterByCheckingFirstPosition() {
		try {
			assertEquals(3, Calculator.add("//;\n1;2"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Custom Delimiter can be custom Regex Character
	 */
	@Test
	public void testAllowCustomDelimiter() {
		try {
			assertEquals(3, Calculator.add("//.\n1.2"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
