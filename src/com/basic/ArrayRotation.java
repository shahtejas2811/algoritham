package com.basic;

import java.util.stream.IntStream;

/**
 * Input: nums = [1,2,3,4,5,6,7], k = 3 
 * Output: [5,6,7,1,2,3,4] 
 * 
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6] 
 * rotate 2 steps to the right: [6,7,1,2,3,4,5] 
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * 
 * @author Tejas Shah
 *
 */
public class ArrayRotation {

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7 };
		int rotation = 3;
		rotate(array, rotation);

		System.out.println("Array Rotation  ");
		IntStream.of(array).forEach(System.out::print);

	}

	public static void rotate(int[] nums, int k) {
		// speed up the rotation
		k = k % nums.length;
		int temp, previous;
		for (int i = 0; i < k; i++) {
			// to pickup last element from Array
			previous = nums[nums.length - 1];
			// shift array element one by one to right side
			for (int j = 0; j < nums.length; j++) {
				temp = nums[j];
				nums[j] = previous;
				previous = temp;
			}
			//IntStream.of(nums).forEach(System.err::print);
			//System.err.println("--");
		}
	}

}
