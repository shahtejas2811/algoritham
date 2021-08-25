package com.basic;

/**
 * The Fibonacci Sequence is the series of numbers: i/p n =5 o/p : 0, 1, 1, 2, 3
 * 
 * @author Tejas
 *
 */
public class FibonacciSeries {
	
	static int n1=0,n2=1,n3=0;    // for recursion
	
	public static void main(String[] args) {
		int count = 8;
		//SeriesWithOutRecursion(count);
		System.out.print(n1+" "+n2);//printing 0 and 1    
		SeriesWithRecursion(count-2);//n-2 because 2 numbers are already printed   
	}

	static void SeriesWithOutRecursion(int n) {
		
		int n1=0,n2=1,n3,i;    
		 System.out.print(n1+" "+n2);//printing 0 and 1 
		 
		//loop starts from 2 because 0 and 1 are already printed  
		 for(i=2;i<n;++i)   
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
	}

	static void SeriesWithRecursion(int n) {
		  if(n>0){    
		         n3 = n1 + n2;    
		         n1 = n2;    
		         n2 = n3;    
		         System.out.print(" "+n3);   
		         SeriesWithRecursion(n-1);    
		     }    
	}
}
