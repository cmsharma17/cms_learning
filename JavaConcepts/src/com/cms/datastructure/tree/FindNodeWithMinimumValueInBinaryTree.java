package com.cms.datastructure.tree;
/*
 * Find the node with minimum value in a Binary Search Tree
This is quite simple. Just traverse the node from root to left recursively until left is NULL. T
he node whose left is NULL is the node with minimum value.
 * */
public class FindNodeWithMinimumValueInBinaryTree {
	Node findMinimum(Node node) {
		Node current = node;
		while(current.left != null) {
			current = current.left;
		}
		return current;
	}
	
	public static void main(String[] args) { 
		BinarySearchTree tree = new BinarySearchTree(); 
        Node root = null; 
        root = tree.insert(root, 4); 
        tree.insert(root, 2); 
        tree.insert(root, 1); 
        tree.insert(root, 3); 
        tree.insert(root, 6); 
        tree.insert(root, 5); 
        
        FindNodeWithMinimumValueInBinaryTree findMinObj = new FindNodeWithMinimumValueInBinaryTree();
        
        System.out.println("Minimum value of BST is " + findMinObj.findMinimum(root).data); 
    } 
	
}

class BinarySearchTree {
	Node root;

	BinarySearchTree() {
		root = null;
	}

	Node insert(Node node, int data) {
		if (node == null) {
			return new Node(data);
		} else if (data <= node.data) {
			node.left = insert(node.left, data);
		} else {
			node.right = insert(node.right, data);
		}
		return node;
	}
	
	
	
}

class Node {
	Node left;
	Node right;
	int data;

	Node(int data) {
		this.data = data;
		this.left = this.right = null;
	}
}
