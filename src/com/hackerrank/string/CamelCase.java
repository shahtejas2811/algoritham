package com.hackerrank.string;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * There is a sequence of words in CamelCase as a string of letters,S,  having the following properties:
 * It is a concatenation of one or more words consisting of English letters.
 * All letters in the first word are lowercase.
 * For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
 * Given String, determine the number of words in String.
 * Example
 * I/P:
 * s= "oneTwoThree"
 * There are  words in the string: 'one', 'Two', 'Three'. output is 3 
 * @author Tejas
 *
 */
public class CamelCase {

    // Complete the camelcase function below.
    static int camelcase(String s) {
    	return s.split("[A-Z]").length;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        String s = scanner.nextLine();

        int result = camelcase(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
