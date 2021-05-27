package com.leetcode;
/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 * 
 * Example 1:
 * Input: "A man, a plan, a canal: Panama"
 * 
 * Output: true
 * Example 2:
 * 
 * Input: "race a car"
 * Output: false
 * 
 * @author Tejas
 *
 */
public class ValidPalimdrome {
	
	public static void main(String[] args) {

		boolean result = isValidPralimdrom("A man, a plan, a canal: Panama");
		if (result) {
			System.out.println("Given String is valid palimdrom");
		} else {
			System.out.println("Given String is not valid palimdrom");
		}
	}

	private static boolean isValidPralimdrom(String string) {
		
		if (string.length() <= 1)
			return true;
		
		char alphanumneric[]  = new char[string.length()];
		int j =0;
		
		for (int i=0 ; i < string.length(); i++){
			  if ( (string.charAt(i) >= 'A' && string.charAt(i)  <= 'Z') 
					  || (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') 
					  || (string.charAt(i) >= '0' && string.charAt(i) <= '9') ){
				  alphanumneric[j] = Character.toLowerCase(string.charAt(i));
				  j++;
			  }
			 
			  
		}
		int r = j-1;
		for (int l=0 ; l < j; l++){
			
			if (alphanumneric[l] != alphanumneric[r]){
				return false;
			}
			r--;
		}
		
		return true;
	}
}
