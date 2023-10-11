class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	return checkBalance(root) != -1;
    }

    private int checkBalance(Node root) {
        if (root == null) {
            return 0;
        }

        int lht = checkBalance(root.left);
        if (lht == -1) {
            return -1; // Left subtree is unbalanced, so the whole tree is unbalanced.
        }

        int rht = checkBalance(root.right);
        if (rht == -1) {
            return -1; // Right subtree is unbalanced, so the whole tree is unbalanced.
        }

        int heightDiff = Math.abs(lht - rht);
        if (heightDiff > 1) {
            return -1; // marking the tree is unbalanced.
        }

        return 1 + Math.max(lht, rht); // Return the height of the current subtree.
    }
}
