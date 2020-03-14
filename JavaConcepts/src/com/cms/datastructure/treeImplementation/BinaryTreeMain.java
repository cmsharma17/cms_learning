package com.cms.datastructure.treeImplementation;

public class BinaryTreeMain {
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		TreeFunctionality treeFun = new TreeFunctionality();
		System.out.println("\nPostorder traversal of binary tree is");
		treeFun.printPostOrder(tree.root);
		
		System.out.println("\nPreorder traversal of binary tree is");
		treeFun.printPreOrder(tree.root);
		
		System.out.println("\nInorder traversal of binary tree is");
		treeFun.printInOrder(tree.root);
	}
}
