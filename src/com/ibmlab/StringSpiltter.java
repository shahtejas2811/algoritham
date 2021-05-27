package com.ibmlab;

import java.util.ArrayList;
import java.util.List;
/**
 * IP :  "My name is 'Tejas, Shah', I currently work for Citicorp , I have 10+ years of experience";
 * 
 * O/P : My name is 'Tejas, Shah'
 * 		 I currently work for Citicorp
 *       I have 10+ years of experience
 *       
 * @author Tejas
 *
 */
public class StringSpiltter {

	public static void main(String[] args) {

		String str = "My name is 'Tejas, Shah', I currently work for Citicorp , I have 10+ years of experience";

		int tmp = 0, cnt = 0;
		List<String> listOfString = new ArrayList<>();
		String spilttedString;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '\'') {
				cnt++;
			}

			if ((str.charAt(i) == ',' || i == str.length()-1 ) && cnt % 2 == 0) {

				spilttedString = str.substring(tmp, i);
				listOfString.add(spilttedString);
				tmp = i;
				tmp++;
			}

		}

		listOfString.forEach(System.out::println);

	}
}
