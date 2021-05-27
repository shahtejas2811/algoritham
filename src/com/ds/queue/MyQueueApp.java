package com.ds.queue;

public class MyQueueApp {

	public static void main(String[] args) {
		MyQueue<Integer> myQueue = new MyQueue<>(5);
		myQueue.insert(10);
		myQueue.insert(20);
		myQueue.insert(30);
		myQueue.insert(40);
		myQueue.insert(50);
		myQueue.view();
		myQueue.remove();
		myQueue.view();
	}

}
