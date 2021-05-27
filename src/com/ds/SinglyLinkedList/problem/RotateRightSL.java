package com.ds.SinglyLinkedList.problem;

import com.ds.SinglyLinkedList.Node;
import com.ds.SinglyLinkedList.SinglyLinkedList;

/**
 * Given a singly singly linked list and an integer K, the task is to rotate the
 * linked list clockwise to the right by K places. 
 * Examples:
 * 
 * Input: 1 -> 2 -> 3 -> 4 -> 5 -> NULL, K = 2 
 * Output: 4 -> 5 -> 1 -> 2 -> 3 -> NULL 
 * 
 * Input: 7 -> 9 -> 11 -> 13 -> 3 -> 5 -> NULL, K = 12
 * Output: 7 -> 9 -> 11 -> 13 -> 3 -> 5 -> NULL
 * 
 * @author Tejas
 *
 */
public class RotateRightSL {

	public static void main(String[] args) {

		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

		singlyLinkedList.insertFirst(1);
		singlyLinkedList.insertLast(2);
		singlyLinkedList.insertLast(3);
		singlyLinkedList.insertLast(4);
		singlyLinkedList.insertLast(5);
		singlyLinkedList.iterateList();
		System.out.println("====================");
		Node head = rotateClockWise(singlyLinkedList, 3);
		
		singlyLinkedList.iterateList(head);
		
		

	}

	private static Node  rotateClockWise(SinglyLinkedList singlyLinkedList, int k) {
		
		Node head = singlyLinkedList.getHead();
		
		// to find size of linkedlist
		int size = 1;
		Node lastNode = head;

		while (lastNode.getNext() != null) {
			size++;
			lastNode = lastNode.getNext();
		}
		
		// reduce number of iteration 
		if (k > size ){
			k = k % size;
		}
		

		if (head == null || k == 0 || k == size) {

			return head;

		}
		
		// for clock wise rotation
		k =  size -k;
		int cnt = 1;
	
		Node kthNode = head;
		
		while (cnt < k && kthNode != null) {
			cnt++;
			kthNode = kthNode.getNext();
			
		}
		
		//last node next pointing to old head (i.e 1st elememt in LS)
		lastNode.setNext(head);
		//kth node next become new head
		head = kthNode.getNext();
		//kth node next become null (i.e end of linked list)
		kthNode.setNext(null);
		return head;
	}

}
