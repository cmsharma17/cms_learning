package com.cms.datastructure.singlyLinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListFunctionality {

	public void insert(LinkList list, String data) {
		Node newNode = new Node(data);
		newNode.next = null;

		if (list.head == null) {
			list.head = newNode;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
	}

	public void printList(LinkList list) {
		Node currentNode = list.head;
		while(currentNode != null) {
			System.out.print(""+currentNode.data+" ");
			currentNode = currentNode.next;
			
		}
	}

	public void findLengthofLinkedList(LinkList list) {
		Node currNode = list.head;
		int count = 0;
		while(currNode != null) {
			count ++;
			currNode = currNode.next;
		}
		System.out.println("\nLenght of the Link List is -->"+count);
	}

	public void findMiddleElement(LinkList list) {
		Node fastPtr = list.head;
		Node slowPtr = list.head;
		while(fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
		}
		System.out.println("Middle Element-->"+slowPtr.data);
	}

	public String findNthNode(LinkList list, int n) {
		Node current = list.head;
		int count = 0;
		while(current != null) {
			if(count == n) {
				System.out.println("Nth Node Data->"+current.data);
				return current.data;
			}
			count ++;
			current = current.next;
		}
		return null;
	}

	public void printNthFromLast(LinkList list, int n) {
		Node current = list.head;
		int len = 0;
		// 1) count the number of nodes in Linked List 
		while(current != null) {
			len ++;
			current = current.next;
		}
		
		// check if value of n is not more than length of 
        // the linked list 
		if(n > len)
			return;
		
		current = list.head;
		for(int i=1; i< len-n+1; i++) {
			current = current.next;
		}
		System.out.println("Nth Element from the End--"+current.data);
		
	}
	
	public boolean detectLoop(LinkList list) {
		Node current = list.head;
		Set<Node> s = new HashSet<>();
		while(current != null) {
			if(s.contains(current)) {
				System.out.println("Given List Having Loop");
				return true;
			}
			s.add(current);
			current = current.next;
		}
		return false;
	}
	
}

