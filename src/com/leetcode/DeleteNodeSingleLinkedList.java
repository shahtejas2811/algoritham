package com.leetcode;

import com.ds.SinglyLinkedList.Node;
import com.ds.SinglyLinkedList.SinglyLinkedList;

/**
 * Write a function to delete a node in a singly-linked list. You will not be given access to the head of the list, instead you will be given access to the node to be deleted directly.
 * It is guaranteed that the node to be deleted is not a tail node in the list.
 * 
 * Example 1:
 * 
 * Input: head = [4,5,1,9], node = 5
 * Output: [4,1,9]
 * Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
 * 
 * Example 2:
 * Input: head = [4,5,1,9], node = 1
 * Output: [4,5,9]
 * Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.
 * 
 * Example 4:
 * Input: head = [0,1], node = 0
 * Output: [1]
 * 
 * Example 5:
 * Input: head = [-3,5,-99], node = -3
 * Output: [5,-99]
 * 
 * @author Tejas
 *
 */
public class DeleteNodeSingleLinkedList {

	public static void main(String[] args) {
		
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertFirst(4);
		list.insertLast(5);
		list.insertLast(1);
		list.insertLast(9);
		
		list.iterateList();
		Node node = list.getHead();
		node = node.getNext();
		
		
		
		deletNode(node);
		list.iterateList();
		
	}

	private static void deletNode(Node node) {
			Node curr =  node;
			Node next = node.getNext();
			if(next != null){
				curr.setData(next.getData()); // copy next node to current node 
				curr.setNext(next.getNext()); // delete next node
			} else { 
				curr.setNext(null);
			}
	}

}
