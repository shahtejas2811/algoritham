package com.hackerrank.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Reduce a string of lowercase characters in range ascii[‘a’..’z’] by doing a
 * series of operations. In each operation, select a pair of adjacent letters
 * that match, and delete them. Delete as many characters as possible using this
 * method and return the resulting string. If the final string is empty, return
 * Empty String
 * 
 * Example 1 I/P : aaabccddd O/P : abd
 * 
 * Explanation
 *
 * Perform the following sequence of operations to get the final string:
 * 
 * aaabccddd → abccddd → abddd → abd
 * 
 * Example 2 I/P : aa O/P : Empty String aa → Empty String
 * 
 * @author Tejas
 *
 */
public class SuperReducedString {

	// Complete the superReducedString function below.
	static String superReducedString(String s) {
		if (s.length() <= 1)
			return s.length() == 0 ? "Empty String" : s;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				// use recursion here
				return superReducedString(s.substring(0, i - 1) + s.substring(i + 1));
			}
		}
		return s.length() == 0 ? "Empty String" : s;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

		String s = bufferedReader.readLine();

		String result = superReducedString(s);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
