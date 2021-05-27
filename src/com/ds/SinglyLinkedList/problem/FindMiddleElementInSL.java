package com.ds.SinglyLinkedList.problem;

import com.ds.SinglyLinkedList.Node;
import com.ds.SinglyLinkedList.SinglyLinkedList;

/**
 * Given a singly linked list, find the middle of the linked list. if the given
 * linked list is 1->2->3->4->5 then the output should be 3. If there are even
 * nodes, then there would be two middle nodes, we need to print the second
 * middle element.
 * 
 * For example, if given linked list is 1->2->3->4->5->6 then output should be
 * 4.
 * 
 * @author Tejas
 *
 */
public class FindMiddleElementInSL {

	public static void main(String[] args) {

		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

		singlyLinkedList.insertFirst(10);
		singlyLinkedList.insertLast(20);
		singlyLinkedList.insertLast(30);
		singlyLinkedList.insertLast(40);
		singlyLinkedList.insertLast(50);
		singlyLinkedList.insertLast(60);
		singlyLinkedList.insertLast(70);

		singlyLinkedList.iterateList();
		System.out.println();
		Node head = singlyLinkedList.getHead();

		Node fast = head;
		Node slow = head;
		// Traverse linked list using two pointers. Move one pointer by one and
		// the other pointers by two. When the fast pointer reaches the end slow
		// pointer will reach the middle of the linked list.
		while (fast != null && fast.getNext() != null) {

			slow = slow.getNext();

			fast = fast.getNext().getNext();

		}
		System.out.println("=================");
		slow.displayNode();
	}

}
