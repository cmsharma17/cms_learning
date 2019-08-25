package hackathonExample;

//import java.util.LinkedList;

//import LinkedListTest.Node;

public class LinkedListReverse {
	
	Node head;
	
	private static class Node{
		private Node  next;
		private int value;
		
		Node(int value){
			this.value = value;
		}
	}
	
	/*Add Node at last */
	public void addToTheLast(Node node){
		if(head == null){
			head = node;
		}
		else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
 			temp.next = node;
		}
	}
	
	/*Print LinkedList */
	public void printList(Node head){
		Node temp = head;
		while(temp.next != null){
			System.out.format("%d ",+temp.value);
			temp = temp.next;
		}
		System.out.println(temp.value);
	}
	
	// Reverse linkedlist using this function   
	public static Node reverseList(Node currentNode){
		Node previousNode = null;
		Node nextNode;
		while(currentNode != null){
			nextNode = currentNode.next;
			currentNode.next = previousNode ;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;
	}
	
	public static void main(String[] args) {
		LinkedListReverse list = new  LinkedListReverse();
		Node head=new Node(5); 
		list.addToTheLast(head);
		list.addToTheLast(new Node(7));
		list.addToTheLast(new Node(4));
		list.addToTheLast(new Node(13));
		list.addToTheLast(new Node(2));
		
		list.printList(head);
		Node reverseHead=reverseList(head);  
		System.out.println("After Reversing::");
		list.printList(reverseHead);

	}

}
