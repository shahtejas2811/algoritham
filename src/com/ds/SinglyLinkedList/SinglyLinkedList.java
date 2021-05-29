package com.ds.SinglyLinkedList;

public class SinglyLinkedList {

	private Node head;
	private Node tail;

	public void insertFirst(int data) {

		Node newNode = new Node();

		newNode.setData(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			// New Node also pointing to the node which is already pointed by
			// First
			// Node
			newNode.setNext(head);
			// Now first is pointed by newNode
			head = newNode;
		}

	}

	public Node deleteFirst() {
		Node deletedNode = head;
		// head node should be pointed to head.next
		head = head.getNext();
		return deletedNode;
	}

	public void insertLast(int data) {
		Node newNode = new Node();
		
		newNode.setData(data);
		newNode.setNext(null);
		
		tail.setNext(newNode);
		tail = newNode;

	}

	public Node deleteLast() {
		Node current = head;
		while (current.getNext().getNext() != null) {
			current = current.getNext();
		}
		Node tmpNode = current.getNext();
		current.setNext(null);
		return tmpNode;
	}

	public void iterateList() {
		Node current = head;
		System.out.println("Linked List");
		while (current != null) {
			current.displayNode();
			current = current.getNext();
			System.out.print("->");
		}
		System.out.println();
	}

	public void iterateList(Node head) {
		Node current = head;
		System.out.println("Linked List");
		while (current != null) {
			current.displayNode();
			current = current.getNext();
			System.out.print("->");
		}
		System.out.println();
	}
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public void makeLoop(int n) {
		  Node temp1 = head;
		  Node temp2 = head;
		  while (temp1.getNext() != null) {
		   temp1 = temp1.getNext();
		  }
		  for (int i = 1; i < n; i++) {
		   temp2 = temp2.getNext();
		  }
		  temp1.setNext(temp2);
		 }

}
