package com.ds.queue;

public class MyQueueUsingLinkedlistApp {

	public static void main(String[] args) {
		MyQueueUsingLinkList<Integer> myQueue = new MyQueueUsingLinkList<>(5);
		myQueue.insert(10);
		myQueue.insert(20);
		myQueue.insert(30);
		myQueue.insert(40);
		myQueue.insert(50);
		myQueue.view();
		myQueue.remove();
		myQueue.remove();
		myQueue.remove();
		myQueue.remove();
		myQueue.remove();
		myQueue.remove();
		
		myQueue.view();
		
	}

}
