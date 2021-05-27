package com.basic;

public class SecondHighestInArray {
	
	public static void main(String[] args) {

		int array[] = { 10, 23, 1, 5, 3, 10, 15 };

		sortArray(array);

		System.out.print("Second Highest elements in Array :  " + array[array.length - 2]);

	}

	private static void sortArray(int[] array) {
		int tmp;
		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] > array[j]) {

					tmp = array[j];
					array[j] = array[i];
					array[i] = tmp;
				}

			}
		}
	}
}
