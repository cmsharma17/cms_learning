package com.cms.datastructure.binaryTree;

public class BinaryTree {
	// Root of BST 
	static Node root;
	BinaryTree(){
		root = null;
	}
	
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		/* Let us create following BST 
		 
        50 
     /     \ 
    30      70 
   /  \    /  \ 
 20   40  60   80 
 
 */
		
		BinaryTreeFunctionality btf = new BinaryTreeFunctionality();
		root = btf.insert(50, root);
		btf.insert(30, root);
		btf.insert(20, root);
		btf.insert(40, root);
		btf.insert(70, root);
		btf.insert(60, root);
		btf.insert(80, root);
		
		btf.inorderRec(root);
		
		if( btf.search(root, 20) != null) {
			System.out.println("\nKey Is present");
		}
		
		

  System.out.println("Inorder traversal of the given tree"); 
  btf.inorderRec(root);

  System.out.println("\nDelete 20"); 
  btf.deleteRec(root, 20); 
  System.out.println("Inorder traversal of the modified tree"); 
  btf.inorderRec(root);
		
	}
}
