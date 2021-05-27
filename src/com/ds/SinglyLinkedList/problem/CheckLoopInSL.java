package com.ds.SinglyLinkedList.problem;

import com.ds.SinglyLinkedList.Node;
import com.ds.SinglyLinkedList.SinglyLinkedList;

/**
 * Floyd’s Cycle-Finding Algorithm Traverse linked list using two pointers. Move
 * one pointer(slow_p) by one and another pointer(fast_p) by two.
 * 
 * If these pointers meet at the same node then there is a loop. If pointers do
 * not meet then linked list doesn’t have a loop.
 * 
 * @author Tejas
 *
 */
public class CheckLoopInSL {

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
		
		// make loop for Testing
		singlyLinkedList.makeLoop(5);

		Node slow = singlyLinkedList.getHead();
		Node fast = singlyLinkedList.getHead();
		boolean isLoop = false;
		while (fast != null && fast.getNext() != null) {

			slow = slow.getNext();
			fast = fast.getNext().getNext();

			if (slow == fast) {
				isLoop = true;
				break;
			}
		}

		if (isLoop) {
			System.out.println("Linked list has loop");
		} else {
			System.out.println("Linked list has not loop");
		}
	}
}
