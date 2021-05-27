package com.basic;

/**
 * Find second highest element from Array using single for loop
 * 
 * @author Tejas
 *
 */

public class SecondHighestInArrayForSingleLoop {

	public static void main(String[] args) {
		int array[] = { 10, 23, 5, 15 };
		secondHighestForArray(array);
	}

	private static void secondHighestForArray(int[] array) {

		int first = 0, second = 0;

		for (int num : array) {

			if (first < num) {
				second = first;
				first = num;
			} else if (second < num) {
				second = num;
			}

		}

		System.err.println("1 Highest:" + first);
		System.err.println("2 Highest:" + second);
	}
}
