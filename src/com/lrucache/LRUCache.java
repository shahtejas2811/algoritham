package com.lrucache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The characteristics of LRU cache 
 * 
 * 1. Maintains fixed number of elements. Orders the elements based on their usage  pattern. 
 * 2. Most recently used element always remains on head while least recently used element is stored at tail.
 * 3. Removes the element that was least recently used when cache gets full.
 * 
 * @author Tejas
 *
 * @param <K>
 * @param <V>
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {

	private static final long serialVersionUID = 1L;
	private final int CAPACITY = 0 ;
	
	 protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
	        return true;
	 }

}
