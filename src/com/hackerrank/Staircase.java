package com.hackerrank;
import java.util.Scanner;
/**
 * Staircase detail
 * This is a staircase of size : i/p  :4
 * output : 
 *     #
 *    ##
 *   ###
 *  ####
 *  Its base and height are both equal to 4. 
 *  It is drawn using # symbols and spaces.
 * @author Tejas
 *
 */
public class Staircase {

    // Complete the staircase function below.
    static void staircase(int n) {

    	for (int i = 0; i < n; i++) {
    		for (int j = 0 ;  j < n; j++) {
    			if(i >= ((n-1) -j)){
    				System.out.print("#");
    			} else {
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
		}

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
