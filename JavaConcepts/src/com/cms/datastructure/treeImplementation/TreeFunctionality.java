package com.cms.datastructure.treeImplementation;

public class TreeFunctionality {
	
	/* Given a binary tree, print its nodes according to the 
    "bottom-up" postorder traversal. */
	void printPostOrder(Node node) {
		if( node ==  null ) {
			return;
		}
		printPostOrder(node.left);
		printPostOrder(node.right);
		
		System.out.print(node.key + " ");
	}
	
	public void printPreOrder(Node node) {
		if(node == null )
			return;
		/* first print data of node */
        System.out.print(node.key + " "); 
  
        /* then recur on left sutree */
        printPreOrder(node.left); 
  
        /* now recur on right subtree */
        printPreOrder(node.right); 
	}
	
	public void printInOrder(Node node) {
		if(node == null )
			return;
		printInOrder(node.left);
		
		System.out.print(node.key + " ");
		
		printInOrder(node.right);
		
	}
	
}
