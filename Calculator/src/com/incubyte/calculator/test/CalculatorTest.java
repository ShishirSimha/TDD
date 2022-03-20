package com.incubyte.calculator.test;


import com.incubyte.calculator.Calculator;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test; 

/**
 * Test class for calculator
 * @author shishir
 *
 */
public class CalculatorTest {
	
	
	/**
	 * Test Method to add two numbers separated by a ,
	 */
	@Test
	public void testAddTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}
	
	/**
	 * Test Method to add an empty string
	 */
	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
	
	/**
	 * Test Method check if a number is passed
	 */
	@Test
	public void testSingleNumber() {
		assertEquals(123, Calculator.add("123"));
	}
	
	/**
	 * Test Method to add four numbers separated by a ,
	 */
	@Test
	public void testAddFourNumbers() {
		assertEquals(14, Calculator.add("1,2\n3, 8"));
	}
	
}
