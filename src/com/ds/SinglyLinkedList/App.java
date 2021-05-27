package com.ds.SinglyLinkedList;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		
		System.out.println("Insert Node at the beginning of List");
		singlyLinkedList.insertFirst(10);
		singlyLinkedList.insertFirst(20);
		singlyLinkedList.insertFirst(30);
	
		singlyLinkedList.iterateList();
		
		
	/*	System.out.println("Delete Node at the beginning of List");
		Node temp = singlyLinkedList.deleteFirst();
		temp.displayNode();
		*/
		
		System.out.println("Insert Node at the end of List");
		singlyLinkedList.insertLast(500);
		singlyLinkedList.iterateList();
		
		System.out.println("Delete Node at the end of List");
		Node temp = singlyLinkedList.deleteLast();
		
		temp.displayNode();
	}

}
