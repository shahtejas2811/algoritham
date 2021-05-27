package com.ds.stack;

public class MyStackApp {

	public static void main(String[] args) {
		MyStack<Integer> myStack = new MyStack<>(5);
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);
		myStack.push(50);
		myStack.push(60);
		
		while(! myStack.isEmpty()){
			System.out.println("Pop :"+myStack.pop());
		}
		
		System.out.println("Reverse String ==>"+ reverseString("Hello"));
	}
	
	static String reverseString(String str){
		String reverseString="";
		MyStack <Character> mystack  = new MyStack<>(str.length());
		
		for(int i =0 ; i< str.length() ; i++){
			mystack.push(str.charAt(i));
		}
		
		while(! mystack.isEmpty()){
			reverseString = reverseString + mystack.pop();
		}
		return reverseString;
	}
}
