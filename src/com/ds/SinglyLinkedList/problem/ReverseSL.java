package com.ds.SinglyLinkedList.problem;

import com.ds.SinglyLinkedList.Node;
import com.ds.SinglyLinkedList.SinglyLinkedList;

public class ReverseSL {

	public static void main(String[] args) {

		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

		singlyLinkedList.insertFirst(10);
		singlyLinkedList.insertLast(20);
		singlyLinkedList.insertLast(30);
		singlyLinkedList.insertLast(40);
		singlyLinkedList.insertLast(50);
		singlyLinkedList.iterateList();

		Node current = singlyLinkedList.getHead();
		Node next = null;
		Node previous = null;

		if (current == null) {
			previous = current;
		}

		while (current != null) {
			// next pointer pointing to right node of current node
			next = current.getNext();
			//Set current node link to previous node 
			current.setNext(previous);
			// make previous node as current 
			previous = current;
			// make current point to next
			current = next;
			
		}
		
		singlyLinkedList.setHead(previous);
		singlyLinkedList.iterateList();
	}

}
