package com.cms.datastructure.treeImplementation;
/* Class containing left and right child of current 
node and key value*/
public class Node {
	Node left;
	Node right;
	int key;
	public Node(int item){
		this.key = item;
		left = right = null;
	}
	
}
