package com.ds.SinglyLinkedList.problem;

import com.ds.SinglyLinkedList.Node;
import com.ds.SinglyLinkedList.SinglyLinkedList;

/**
 * Given a singly linked list, rotate the linked list counter-clockwise by k
 * nodes. Where k is a given positive integer. 
 * For example,
 * 
 * linked list 
 * I/P : 10->20->30->40->50->60 and k = 4
 * O/P : 50->60->10->20->30->40
 * 
 * @author Tejas
 *
 */
public class RotateLeftSL {

	public static void main(String[] args) {
		
		SinglyLinkedList sl = new SinglyLinkedList();
		int noOfLetfRotation = 1;
		sl.insertFirst(10);
		sl.insertLast(20);
		sl.insertLast(30);
		sl.insertLast(40);
		sl.insertLast(50);
		sl.insertLast(60);
		
		sl.iterateList();
		System.out.println("After no of  "+noOfLetfRotation + " left rotattion ");
		
		Node head = rotateLS(sl,noOfLetfRotation);
		
		sl.iterateList(head);

	}

	private static Node rotateLS(SinglyLinkedList list,int k){
		Node head = list.getHead();
		
		// to find size of linked list
		int size = 1;
		Node lastNode = head;
		
		while (lastNode.getNext() != null) {
			size++;
			lastNode = lastNode.getNext();

		}
		
		if (k > size) {
			// reduce no of iteration 
			k = k % size;
		}
		// below conditon no rotation requried 
		if (head == null || k == 0 || k == size){
			
			return head ;
		}
		
		// find out kth node 
		int cnt = 1;
		Node kthNode = head;
		
		while (cnt < k && kthNode != null) {
			cnt++;
			kthNode = kthNode.getNext();
		}
		
		// set last node's next  point to old frist
		lastNode.setNext(head);
		// head is setting up kth node next
		head = kthNode.getNext();
		//kth node terminate with null
		kthNode.setNext(null);
		
		return head;
	}

}
