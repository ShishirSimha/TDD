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
	
}
