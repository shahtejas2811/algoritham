package com.deutschebank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Group all anagram word in given list
 * 
 * input : {cat, tac, abt, tca, act, table, bat, bata}
 * output: {{cat, tac, tca, act}, 
 * 			{abt, bat}, 
 * 			{bata}, 
 * 			{table}
 * }	
 * @author Tejas
 *
 */
public class AnagramGroup {

	public static void main(String[] args) {
		
		List<String> anagramList = Arrays.asList("cat", "tac", "abt", "tca", "act", "table", "bat", "bata");
		HashMap<String, List<String>> groupByMap = groupByAnagramString(anagramList);
		
	  // iterate over map
	  Iterator<Map.Entry<String, List<String>>> itr = groupByMap.entrySet().iterator(); 
         
	        while(itr.hasNext()) 
	        { 
	             Map.Entry<String, List<String>> entry = itr.next(); 
	             System.out.println("Key = " + entry.getKey() +  
	                                 ", Value = " + entry.getValue()); 
	        } 
	}

	private static HashMap<String, List<String>> groupByAnagramString(List<String> anagramList) {
		HashMap<String, List<String>> groupByMap = new HashMap<>();
		
		// iterate over input list
		String key;
		List<String> innerList;
		for (String s: anagramList){
			key = stringSorting(s);
			if (groupByMap.containsKey(key)){
				// List is already present 
				innerList=groupByMap.get(key);
				innerList.add(s);
				
			} else {
				
				innerList = new ArrayList<>();
				innerList.add(s);
				groupByMap.put(key, innerList);
				
			}
		}
 		return groupByMap;
	}

	private static String stringSorting(String s) {
		char[] tmpArry = s.toCharArray();
		Arrays.sort(tmpArry);
		return new String(tmpArry);
	}
}
