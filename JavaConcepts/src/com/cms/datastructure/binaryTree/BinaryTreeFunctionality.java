package com.cms.datastructure.binaryTree;

public class BinaryTreeFunctionality {

	/* A recursive function to insert a new key in BST */
	public Node insert(int key, Node root) {
		/* If the tree is empty, return a new node */
		if (root == null) {
			root = new Node(key);
			return root;
		}

		if (key < root.key) {
			root.left = insert(key, root.left);
		} else if (key > root.key) {
			root.right = insert(key, root.right);
		}
		/* return the (unchanged) node pointer */
		return root;
	}
	
	void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.print(root.key+"  "); 
            inorderRec(root.right); 
        } 
    } 
	
	public Node search(Node root, int key) {
		
		// Base Cases: root is null or key is present at root 
	    if (root==null || root.key ==key) 
	        return root; 
		
		if(root.key >  key) {
			return search(root.left, key);
		}
		return search(root.right, key);
	}

	/* A recursive function to insert a new key in BST */
    public Node deleteRec(Node root, int key) 
    { 
        /* Base Case: If the tree is empty */
        if (root == null)  return root; 
  
        /* Otherwise, recur down the tree */
        if (key < root.key) 
            root.left = deleteRec(root.left, key); 
        else if (key > root.key) 
            root.right = deleteRec(root.right, key); 
  
        // if key is same as root's key, then This is the node 
        // to be deleted 
        else
        { 
            // node with only one child or no child 
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
  
            // node with two children: Get the inorder successor (smallest 
            // in the right subtree) 
            root.key = minValue(root.right); 
  
            // Delete the inorder successor 
            root.right = deleteRec(root.right, root.key); 
        } 
  
        return root; 
    } 
    
    int minValue(Node root) 
    { 
        int minv = root.key; 
        while (root.left != null) 
        { 
            minv = root.left.key; 
            root = root.left; 
        } 
        return minv; 
    } 
}
