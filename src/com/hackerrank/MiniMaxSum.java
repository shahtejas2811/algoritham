package com.hackerrank;
import java.util.Scanner;

/*
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
 *  Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 *  Sample Input {1 2 3 4 5 }
 *  Sample Output
 *  10 14
 *  Explanation
 *  The numbers are 1,2 3, 4, and 5. Calculate the following sums using four of the five integers:
 *  Sum everything except 1, the sum is 2 + 3 + 4 + 5 =14.
 *  Sum everything except 2, the sum is 1 + 3 + 4 + 5 =13.
 *  Sum everything except 3, the sum is 1 + 2 + 4 + 5 =12.
 *  Sum everything except 4, the sum is 1 + 2 + 3 + 5 =11.
 *  Sum everything except 5, the sum is 1 + 2 + 3 + 4 =10.
 */
public class MiniMaxSum {

	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {
		
		long min = Integer.MAX_VALUE;
		long max = 0 ;
		long sum = 0;
	
		for (int n : arr){
			sum = sum + n;
			
			if (min > n){
				min = n;
			}
			if (max < n){
				max = n;
			}
		}
		
		System.out.println((sum-max) +" "+ (sum-min) );

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		miniMaxSum(arr);

		scanner.close();
	}

}
