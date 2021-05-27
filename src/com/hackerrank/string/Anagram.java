package com.hackerrank.string;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * Two words are anagrams of one another if their letters can be rearranged to form the other word.
 * you will be given a string. You must split it into two contiguous substrings, 
 * then determine the minimum number of characters to change to make the two substrings into anagrams of one another.
 * 
 * For example, given the string 'abccde', you would break it into two parts: 'abc' and 'cde'.
 * Note that all letters have been used, the substrings are contiguous and their lengths are equal. 
 * Now you can change 'a' and 'b' in the first substring to 'd' and 'e' to have 'dec' and 'cde' which are anagrams.
 * Two changes were necessary.
 * 
 * Sample Input
 * 
 * 6
 * aaabbb
 * ab
 * abc
 * mnop
 * xyyx
 * xaxbbbxx
 * 
 * Sample Output
 * 3
 * 1
 * -1
 * 2
 * 0
 * 1
 * 
 * Explanation
 * 
 * Test Case #01: We split  into two strings ='aaa' and ='bbb'. 
 * We have to replace all three characters from the first string with 'b' to make the strings anagrams.
 * 
 * Test Case #02: You have to replace 'a' with 'b', which will generate "bb".
 * 
 * Test Case #03: It is not possible for two strings of unequal length to be anagrams of one another.
 * 
 * Test Case #04: We have to replace both the characters of first string ("mn") to make it an anagram of the other one.
 * 
 * Test Case #05:  and  are already anagrams of one another.
 * 
 * Test Case #06: Here S1 = "xaxb" and S2 = "bbxx". You must replace 'a' from S1 with 'b' so that S1 = "xbxb".
 * 
 * @author Tejas
 *
 */
public class Anagram {

	// Complete the anagram function below.
	static int anagram(String s) {
		int result = 0;

		if (s.length() % 2 == 0) {

			String s1 = s.substring(0, s.length() / 2);
			String s2 = s.substring(s.length() / 2, s.length());

			for (int i = 0; i < s1.length(); i++) {

				int index = s2.indexOf(s1.charAt(i));

				if (index == -1) {
					result++;
				} else {
					s2 = s2.substring(0, index) + s2.substring(index + 1);
				}
			}

		} else {
			result = -1;
		}
		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();

			int result = anagram(s);

			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
