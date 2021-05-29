package com.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Given an integer array arr, count element x such that x + 1 is also in arr.
 * If there’re duplicates in arr, count them separately.
 * 
 * Example 1:
 * Input: arr = [1,2,3]
 * Output: 2
 * Explanation: 1 and 2 are counted cause 2 and 3 are in arr.
 * 
 * Example 2:
 * Input: arr = [1,1,3,3,5,5,7,7]
 * Output: 0
 * Explanation: No numbers are counted, cause there's no 2, 4, 6, or 8 in arr.
 * 
 * Example 3:
 * Input: arr = [1,3,2,3,5,0]
 * Output: 3
 * Explanation: 0, 1 and 2 are counted cause 1, 2 and 3 are in arr.
 * 
 * Example 4:
 * Input: arr = [1,1,2,2]
 * Output: 2
 * Explanation: Two 1s are counted cause 2 is in arr.
 * @author Tejas
 *
 */
public class CountingElements {

	public static void main(String[] args) {
		
		int[] arr = {1,3,2,3,5,0};
		
		int resultCount = countingElements(arr);
		System.out.println("Result :" +resultCount);
	}

	private static int countingElements(int[] arr) {
		int resultCount =0 ;
		Map<Integer, Integer> backMap = new HashMap<Integer, Integer>();
		int cnt;
		
		// Traverse array and construct Map
		for (int i : arr){
			
			if(backMap.containsKey(i)){
				cnt = backMap.get(i);
				cnt++;
				backMap.put(i, cnt);
			} else {
				cnt =1 ;
				backMap.put(i,cnt);
			}
		}
		int tmp;
		Iterator<Map.Entry<Integer, Integer>> itr = backMap.entrySet().iterator();
		 while(itr.hasNext()){
			 Entry<Integer, Integer> elements = itr.next();
			 tmp = elements.getKey(); 
			 
			 if (backMap.containsKey(tmp+1)){
				 resultCount += elements.getValue();
			 }
			 
			 
		 }
		return resultCount;
	}

}
