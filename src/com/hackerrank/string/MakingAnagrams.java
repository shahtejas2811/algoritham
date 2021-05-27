package com.hackerrank.string;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * We consider two strings to be anagrams of each other if the first string's
 * letters can be rearranged to form the second string. In other words, both
 * strings must contain the same exact letters in the same exact frequency. For
 * example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.
 * 
 * Given two strings, S1 and , S2 that may not be of the same length, determine
 * the minimum number of character deletions required to make S1 and S2
 * anagrams.Any characters can be deleted from either of the strings.
 * 
 * For example,S1=abc and S2=anmop . The only characters that match are the a's
 * so we have to remove "bc" from S1 and "nmop" from S2 for a total of 6 deletions.
 * 
 * 
 * Sample Input
 * 
 * cde
 * abc
 * 
 * Sample Output
 * 
 * 4
 * 
 * Explanation
 * 
 * We delete the following characters from our two strings to turn them into anagrams of each other:
 * 
 * Remove d and e from cde to get c.
 * 
 * Remove a and b from abc to get c.
 * We had to delete  characters to make both strings anagrams.
 * @author Tejas
 *
 */
public class MakingAnagrams {

    // Complete the makingAnagrams function below.
    static int makingAnagrams(String s1, String s2) {
    	 String small;
    	 String big;
    	 int missed=0,commonoccurance = 0, result = 0 ,intialBigLen =0;
    	 
    	 if (s1.length() > s2.length()){
    		 big = s1;
    		 small = s2;
    	 } else {
    		 big = s2;
    		 small = s1;
    	 }
    	 
    	 int index;
    	 intialBigLen = big.length();
    	 for (int i=0;i<small.length();i++){
    		  index = big.indexOf(small.charAt(i)) ;  
    		  if (index == -1){
    			  missed++;
    		  } else {
    			  commonoccurance++;
    			 big =  big.substring(0, index) + big.substring(index+1);
    		  }
    	 }
    	 result = (intialBigLen - commonoccurance ) +  missed;
		return result;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
