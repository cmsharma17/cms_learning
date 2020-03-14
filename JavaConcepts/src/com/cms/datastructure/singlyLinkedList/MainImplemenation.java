package com.cms.datastructure.singlyLinkedList;

public class MainImplemenation {
	public static void main(String args[]) {
		LinkedListFunctionality llf = new LinkedListFunctionality();
		LinkList list = new LinkList();
		llf.insert(list, "1");
		llf.insert(list, "2");
		llf.insert(list, "3");
		llf.insert(list, "4");
		llf.insert(list, "5");
		
		llf.printList(list);
		llf.findLengthofLinkedList(list);
		llf.findMiddleElement(list);
		llf.findNthNode(list, 3);
		llf.printNthFromLast(list, 2);
		
		LinkList llist = new LinkList(); 
		  
		llf.insert(llist, "20"); 
		llf.insert(llist,"4"); 
		llf.insert(llist, "15"); 
		llf.insert(llist, "10"); 
		
		/*Create loop for testing */
        llist.head.next.next.next.next = llist.head;
        llf.detectLoop(llist);
	}
}
