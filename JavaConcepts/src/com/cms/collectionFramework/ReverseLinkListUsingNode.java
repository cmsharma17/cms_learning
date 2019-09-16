package com.cms.collectionFramework;

public class ReverseLinkListUsingNode {
	
	private Node head;
	
	private static class Node{
		private int value;
		private Node next;
		Node(int value){
			this.value = value;
		}
	}
	
	
	public void addToList(Node node){
		if(head == null){
			head = node;
		}
		else{
			Node temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	public void printList(Node head){
		Node temp = head;
		while(temp != null){
			System.out.format("%d ", temp.value );
			temp = temp.next;
		}
		System.out.println();
	}
	
	// Reverse linkedlist using this function   
	public static Node reverseLinkList(Node currentNode){
		Node previousNode = null;
		Node nextNode ;
		while(currentNode!=null){
			nextNode = currentNode.next;
			// reversing the link  
			currentNode.next=previousNode;  
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;
	}
	
	public static void main(String args[]){
		ReverseLinkListUsingNode linkedList = new ReverseLinkListUsingNode();
		Node head = new Node(5);
		linkedList.addToList(head);
		linkedList.addToList(new Node(6));
		linkedList.addToList(new Node(7));
		linkedList.addToList(new Node(1));
		linkedList.addToList(new Node(2));
		
		linkedList.printList(head);
		
		Node reverseHead = reverseLinkList(head);
		System.out.println("After reversing"+reverseHead.value);  
		linkedList.printList(reverseHead);  
	}
}
