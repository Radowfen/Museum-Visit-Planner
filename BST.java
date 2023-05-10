
class BST {
    TreeNode root;
    
    public BST() {
        root = null;
    }
    
    public void insert(int val) {
        root = insertNode(root, val);
    }
    
    private TreeNode insertNode(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insertNode(root.left, val);
        } else if (val > root.val) {
            root.right = insertNode(root.right, val);
        }
        return root;
    }
    
    public boolean search(int val) {
        return searchNode(root, val);
    }
    
    private boolean searchNode(TreeNode root, int val) {
        if (root == null) {
            return false;
        }
        if (root.val == val) {
            return true;
        } else if (val < root.val) {
            return searchNode(root.left, val);
        } else {
            return searchNode(root.right, val);
        }
    }
    
    public void inorderTraversal() {
        inorderTraversalHelper(root);
    }
    
    private void inorderTraversalHelper(TreeNode root) {
        if (root != null) {
            inorderTraversalHelper(root.left);
            System.out.print(root.val + " ");
            inorderTraversalHelper(root.right);
        }
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(15);
        bst.insert(10);
        bst.insert(20);
        bst.insert(8);
        bst.insert(12);
        bst.insert(17);
        bst.insert(25);
        bst.insert(5);
        bst.insert(9);
        bst.insert(16);
        bst.insert(11);
        bst.insert(19);
        
        System.out.println("Inorder Traversal: ");
        bst.inorderTraversal();
        System.out.println("\nSearch for 17: " + bst.search(17));
        System.out.println("Search for 13: " + bst.search(13));
    }

}

