import java.util.*;

public class ZPaintingOrder {
    
    // Node class for linked list
    private static class Node {
        String painting;
        Node next;
        
        public Node(String painting) {
            this.painting = painting;
        }
    }
    
    // Binary search tree node class
    private static class TreeNode {
        String painting;
        TreeNode left, right;
        
        public TreeNode(String painting) {
            this.painting = painting;
        }
    }
    
    public static void main(String[] args) {
        // Create a map of paintings and their distances
        Map<String, Integer> distances = new HashMap<>();
        distances.put("paintA", 30);
        distances.put("paintB", 60);
        distances.put("paintC", 5);
        distances.put("paintD", 15);
        distances.put("paintE", 40);
        distances.put("paintF", 100);
        distances.put("paintG", 80);
        distances.put("paintH", 25);

         // Print out the list of paintings with their distances
         System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
         System.out.println("Paintings in the museum:");
         for (String painting : distances.keySet()) {
             System.out.println(painting + " - " + distances.get(painting) + "m");
         }
         System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
         
        
        // Get user input for which paintings to visit
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the paintings you want to visit, separated by spaces:");
        String[] selections = scanner.nextLine().split(" ");
        
        // Create a linked list of selected paintings
        Node head = null;
        for (String painting : selections) {
            if (head == null) {
                head = new Node(painting);
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = new Node(painting);
            }
        }
        
        // Create a binary search tree of selected paintings
        TreeNode root = null;
        for (String painting : selections) {
            if (root == null) {
                root = new TreeNode(painting);
            } else {
                insertNode(root, new TreeNode(painting), distances);
            }
        }
        
        
        // Output the order of paintings to visit based on linked list
        System.out.print("Order based on linked list: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.painting + " ");
            current = current.next;
        }
        System.out.println();
        
        // Output the order of paintings to visit based on binary search tree
        System.out.print("Order based on binary search tree: ");
        inOrderTraversal(root);
        System.out.println();
    }
    
    // Method to insert a node into a binary search tree
    private static void insertNode(TreeNode root, TreeNode newNode, Map<String, Integer> distances) {
        int distance1 = distances.get(newNode.painting);
        int distance2 = distances.get(root.painting);
        if (distance1 < distance2) {
            if (root.left == null) {
                root.left = newNode;
            } else {
                insertNode(root.left, newNode, distances);
            }
        } else {
            if (root.right == null) {
                root.right = newNode;
            } else {
                insertNode(root.right, newNode, distances);
            }
        }
    }
    
    
    

    private static void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        if (root.left != null) {
            System.out.print(" --> ");
        }
        System.out.print(root.painting);

        if (root.right != null) {
            System.out.print(" --> ");
        }
         
        inOrderTraversal(root.right);
        
    }
    
}
