package com.ds.stack;

public class MyStack<E> {

	private int maxsize;
	private Object[] stackArry;
	private int top;

	public MyStack(int maxSize) {
		this.maxsize = maxSize;
		this.stackArry  =  new Object[maxSize];
		this.top = -1;
	}

	public void push(E e) {
		
		if (isFull()) {
			System.out.println("Stack is Full");
		} else {
			top++;
			stackArry[top] = e;
		}
		
	}

	@SuppressWarnings("unchecked")
	public E pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		} else {
			int tmp_top = top;
			top--;
			return (E) stackArry[tmp_top];
		}
	}

	public int getSize() {
		return top;
	}

	public boolean isFull() {
		return top == maxsize-1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	@SuppressWarnings("unchecked")
	public E peek() {
		return (E) stackArry[top];
	}

}
