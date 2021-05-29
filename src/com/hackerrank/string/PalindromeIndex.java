package com.hackerrank.string;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * Given a string of lower case letters in the range ascii[a-z], determine the index of a character that can be removed
 * to make the string a palindrome. There may be more than one solution, but any will do.
 *  If the word is already a palindrome or there is no solution, return -1. 
 *  Otherwise, return the index of a character to remove.
 *  
 *  Example:
 *  S= "bcbc"
 *  Either remove 'b' at index  or 'c' at index .
 *  
 *  Sample Input
 *  STDIN   Function
 *  -----   --------
 *  3       q = 3
 *  aaab    s = 'aaab' (first query)
 *  baa     s = 'baa'  (second query)
 *  aaa     s = 'aaa'  (third query)
 *  
 *  Sample Output
 *  3
 *  0
 *  -1
 *  
 *  Explanation
 *  
 *  Query 1: "aaab"
 *  Removing 'b' at index 3 results in a palindrome, so return 3.
 *  
 *  Query 2: "baa"
 *  Removing 'b' at index 0 results in a palindrome, so return 0.
 *  
 *  Query 3: "aaa"
 *  This string is already a palindrome, so return -1. 
 * @author Tejas
 *
 */
public class PalindromeIndex {

    // Complete the palindromeIndex function below.
    static int palindromeIndex(String s) {
		int palindromeIndex =-1;
		int j = s.length()-1;
    	for (int i =0 ; i < s.length()/2 ;i++){
    		if (s.charAt(i) != s.charAt(j)){
    				if(isPalindrome(s.substring(i,j))){
    					return j;
    				}
    				return i;
    		}
    		j--;
    	}
    	return palindromeIndex;


    }
    /**
     * to check wheather given string is palimdrop or not 
     * @param str
     * @return
     */
	static boolean isPalindrome(String str) {
		int j = str.length() - 1;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			j--;
		}
		return true;

	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = palindromeIndex(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
