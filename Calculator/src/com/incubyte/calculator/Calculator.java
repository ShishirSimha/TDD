package com.incubyte.calculator;

public class Calculator {
	
	/**
	 * Method that adds up two or more numbers
	 * @param nums
	 * @return
	 */
	public static int add(String nums) {
		int answer = 0;
		//split the numbers
		String[] numbers = splitNumbers(nums);
		
		//throw exception if 1 or more numbers are negative
		
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
			int num = Integer.parseInt(number);
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
		return nums.split(",|\n");
	}
}
