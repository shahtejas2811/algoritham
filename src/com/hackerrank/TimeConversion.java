package com.hackerrank;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
 * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
 * - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 * Example
 * s = "12:01:00PM"
 * Return '12:01:00'.
 * s = "12:01:00AM"
 * Return '00:01:00'.
 * @author Tejas
 *
 */



public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
    	String convertedTime = " ";
    	String horus = s.substring(0,s.indexOf(":"));
    	String remainingTime = s.substring(s.indexOf(":"),s.length()-2);
    	String AM_PM = s.substring(s.length()-2, s.length());
    	int h = Integer.parseInt(horus);
    	
		if (AM_PM.equals("PM")) {
			h = h == 12 ? h : h + 12;
		} else {
			if (h == 0 || h == 12) {
				h = h == 0 ? h : Math.abs(h - 12);
			}

		}
		convertedTime = (h < 10 ? "0" + h : h) + "" + remainingTime;
		return convertedTime;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
