package assignment;

public class BST {
	private TreeNode root; // the top of the tree

    // insert a value into the tree
    public void insert(int v) {
        root = insertRec(root, v);
    }

    // Helper function for insert
    private TreeNode insertRec(TreeNode node, int v) {
        if (node == null) {
            return new TreeNode(v);
        }
        if (v < node.val) {
            node.left = insertRec(node.left, v);
        } else if (v > node.val) {
            node.right = insertRec(node.right, v);
        }
        return node;
    }
    //search for a value in the tree
    public boolean search(int v) {
        return searchRec(root, v);
    }

    private boolean searchRec(TreeNode node, int v) {
        if (node == null) {
            return false; // value not found
        }
        if (node.val == v) {
            return true;  // value found
        }
        if (v < node.val) {
            return searchRec(node.left, v); // search left side
        } else {
            return searchRec(node.right, v); // search right side
        }
    }
    //delete a value in the tree
    public void delete(int v) {
        root = deleteRec(root, v);
    }

    //helper: returns the subtree root
    private TreeNode deleteRec(TreeNode node, int v) {
        if (node == null) {
        	// value not found
        	return null;           
        }
        if (v < node.val) {
        	//go left
            node.left = deleteRec(node.left, v); 
        } else if (v > node.val) {
        	//go right
            node.right = deleteRec(node.right, v); 
        } else {
            //found it: handle 3 cases
            //1) no child or only right child
            if (node.left == null) return node.right;
            //2) only left child
            if (node.right == null) return node.left;
            //3) two children: copy successor (min in right subtree)
            TreeNode succ = min (node.right);
            node.val = succ.val;
            node.right = deleteRec(node.right, succ.val);
        }
        return node;
    }
    //going left all the way
    private TreeNode min(TreeNode n) {
        while (n.left != null) n = n.left;
        return n;
    }
    //in_order_traversal
    	    public void inOrder() {
    	        inOrderRec(root);
    	        System.out.println(); // new line after printing
    	    }

    	    private void inOrderRec(TreeNode node) {
    	        if (node != null) {
    	            inOrderRec(node.left);
    	            System.out.print(node.val + " ");
    	            inOrderRec(node.right);
    	        }
    	    }
}

