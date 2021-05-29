package com.lrucache;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * We use two data structures to implement an LRU Cache.
 * 
 * 
 * Queue :  which is implemented using a doubly linked list. The maximum size of
 * the queue will be equal to the total number of frames available (cache size).
 * The most recently used pages will be front end and least recently pages
 * will be rear end.
 * 
 * HashSet :  A page number as key 
 * 
 * When a page is referenced, the required page may be in the memory. If
 * it is in the memory, we need to detach the node of the list and bring it to
 * the front of the queue. 
 * 
 * If the required page is not in memory, we bring that in memory.
 * In simple words, we add a new node to the front of the queue and
 * update the corresponding node address in the hash. 
 * 
 * If the queue is full, i.e. all the frames are full, we remove a node from the rear of the queue, and add
 * the new node to the front of the queue.
 * 
 * @author Tejas
 *
 */
public class LRUCacheUsingQueueHashset {

	// To store object in cache
	private Deque<Integer> doublyQueue;

	// To Store reference of object in cache
	private HashSet<Integer> hashSet;

	// Maximum capacity of cache
	private final int CACHE_SIZE;

	public LRUCacheUsingQueueHashset(int size) {
		this.doublyQueue = new LinkedList<>();
		this.hashSet = new HashSet<>();
		this.CACHE_SIZE = size;

	}

	public void refer(int page) {

		if (hashSet.contains(page)) {
			// page found in cache.
			/*
			 * The found page may not be always the last element, even if it's
			 * an intermediate element that needs to be removed and added to the
			 * start of the Queue
			 */
			doublyQueue.remove(page);

		} else {
			// page not found in cache
			if (doublyQueue.size() == CACHE_SIZE) {
				// cache is full.Remove Least Recently Used page
				int removedPage = doublyQueue.removeLast();
				hashSet.remove(removedPage);
			}

		}
		// add page front of queue
		doublyQueue.push(page);
		// add page ref entry in set
		hashSet.add(page);
	}

	public void display() {
		doublyQueue.forEach(e -> System.out.print(e + " , "));
	}

	public static void main(String[] args) {
		LRUCacheUsingQueueHashset lruCache = new LRUCacheUsingQueueHashset(3);
		lruCache.refer(1);
		lruCache.refer(2);
		lruCache.refer(3);
		lruCache.refer(1);
		lruCache.refer(4);
		lruCache.refer(5);
		lruCache.refer(2);
		lruCache.refer(2);
		lruCache.refer(1);
		lruCache.display();
	}

}
