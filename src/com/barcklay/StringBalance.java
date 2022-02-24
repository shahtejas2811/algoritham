package com.barcklay;

import java.util.Stack;

public class StringBalance {

	public static void main(String[] args) {

		String s = "{}[ ";

		boolean result = checkBalaceString(s);

		if(result){
			System.out.println("Given String is balanced");
		} else {
			System.out.println("Given String is not balanced");
		}
	}

	private static boolean checkBalaceString(String s) {
		
		boolean result = false;
		Stack<Character> stack = new Stack<>();
		char character;
		
		for (int i = 0; i < s.length(); i++) {
			character = s.charAt(i);

			switch (character) {
			case '{':
				stack.push(character);
				break;
			case '(':
				stack.push(character);
				break;
			case '[':
				stack.push(character);
				break;
			case '}':
				if ('{' != stack.pop())
					return false;
				break;
			case ')':
				if ('(' != stack.pop())
					return false;
				break;
			case ']':
				if ('[' != stack.pop())
					return false;
				break;
			default:
				break;
			}

		}
		if (stack.size() == 0) {
			result = true;
		}
		return result;
	}

}
