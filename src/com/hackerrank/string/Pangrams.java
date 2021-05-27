package com.hackerrank.string;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * A pangram is a string that contains every letter of the alphabet. Given a
 * sentence determine whether it is a pangram in the English alphabet. Ignore
 * case. Return either pangram or not pangram as appropriate.
 * 
 * Input 0 : We promptly judged antique ivory buckles for the next prize
 * Output 0 : pangram
 * Sample Explanation 0
 * 
 * All of the letters of the alphabet are present in the string.
 * 
 * Input 1 : We promptly judged antique ivory buckles for the prize
 * Output 1 :not pangram

 */
public class Pangrams {

	// Complete the pangrams function below.
	@SuppressWarnings("unchecked")
	static String pangrams(String s) {
		s = s.toUpperCase();
		char c;
		@SuppressWarnings("rawtypes")
		HashSet hset = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (c > 64 && c < 92) {
				hset.add(c);
			}

		}
		return hset.size() == 26 ? "pangram" : "not pangram";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

		String s = scanner.nextLine();

		String result = pangrams(s);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
