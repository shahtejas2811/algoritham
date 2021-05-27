package com.ds.queue;

public class MyQueueUsingLinkList<E> {

	private int maxsize; // Max size of queue
	private int front;// to keep track of elememt removal from the front of
						// queue
	private int rear; // to keep track of elememt insertion at end of queue
	private int nElement; // No of element added in queue

	// Underleying data-structrue to hold data
	private Node<E> head;
	private Node<E> tail;

	private class Node<T> {
		T data;
		Node<T> next;
	}

	public MyQueueUsingLinkList(int maxSize) {
		this.maxsize = maxSize;
		this.front = 0;
		this.rear = -1;
		this.nElement = 0;
		this.head = null;
		this.tail = null;

	}

	public void insert(E e) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			Node<E> newNode = new Node<>();
			newNode.data = e;

			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}
		rear++;
		nElement++;
	}

	public E remove() {
		Node<E> tmp = null;
		front++;
		nElement--;
		if (front == maxsize) {
			System.err.println("Queue is empty");
			return null;
		} else {
			if (head == null) {
				System.err.println("Queue is empty");
				return null;
			} else {
				tmp = head;
				head = head.next;
			}
		}
		return (E) tmp.data;

	}

	public boolean isFull() {
		return nElement == maxsize;
	}

	public boolean isEmpty() {
		return nElement == 0;
	}

	public void view() {
		System.out.print("[ ");
		Node curr = head;
		while (curr != null) {

			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.print(" ]");
	}
}
