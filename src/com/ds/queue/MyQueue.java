package com.ds.queue;

public class MyQueue<E> {

	private int maxsize; // Max size of queue
	private int front;// to keep track of elememt removal from the front  of queue
	private int rear; // to keep track of elememt insertion at end of queue
	private int nElement; // No of element added in queue
	private Object[] queueArray; // Underleying datastructrue to hold data
	
	
	public MyQueue(int maxSize){
		this.maxsize = maxSize;
		this.front = 0;
		this.rear = -1;
		this.nElement = 0;
		this.queueArray = new Object[maxSize];
	}
	
	public void insert(E e){
		if(isFull()){
			rear = -1;
			nElement=0;
		}
		rear++;
		queueArray[rear] = e ;
		nElement++;
	}
	
	
	public E remove(){
		Object tmp = queueArray[front];
		front++;
		nElement--;
		if (front == maxsize){
			front = 0;
		}
		return (E)tmp;
		
	}
	
	public boolean isFull(){
		return nElement == maxsize;
	}
	
	public boolean isEmpty(){
		return nElement == 0;
	}
	public void view(){
		System.out.print("[ ");
		for (int i = front; i < queueArray.length; i++) {
			System.out.print(queueArray[i] + " ");
		}
		System.out.print(" ]");
	}
}
