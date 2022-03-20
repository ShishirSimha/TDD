package com.incubyte.calculator;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Calculator {
	
	/**
	 * Method that adds up two or more numbers
	 * @param nums
	 * @return
	 * @throws Exception 
	 */
	public static int add(String nums) throws Exception {
		int answer = 0;
		//split the numbers
		String[] numbers = splitNumbers(nums);
		
		//throw exception if 1 or more numbers are negative
		throwNegativeNumbersIfAny(numbers);
		
		//compute answer
		answer = computeAnswer(numbers);
		return answer;
	}
	
	/**
	 * Method that adds all the numbers
	 * @param numbers
	 * @return
	 */
	private static int computeAnswer(String[] numbers) {
		// TODO Auto-generated method stub
		int answer = 0;
		for(String number : numbers) {
			int num = Integer.parseInt(number.trim());
			answer += num;
		}
		return answer;
	}

	/**
	 * Method that splits numbers based on a splitter.
	 * @param nums
	 * @return
	 */
	private static String[] splitNumbers(String nums) {
		//for empty string return 0;
		if(nums.isEmpty()) {
			return new String[0];
		}
		//else split numbers using comma or \n
		return nums.split(",|\n");
	}
	
	/**
	 * Method that throws exception on negative numbers
	 * 
	 * @param nums
	 * @throws Exception
	 */
	private static void throwNegativeNumbersIfAny(String[] nums) throws Exception {
		ArrayList<String> negative = new ArrayList<String>();
		int size = nums.length;
		for(int i=0; i<size; i++) {
			if(Integer.parseInt(nums[i].trim())<0) {
				negative.add(nums[i]);
			}
		}
		if(negative.size()>0) {
			throw new Exception("negatives not allowed: " + String.join(", ",negative));
		}
	}
}
