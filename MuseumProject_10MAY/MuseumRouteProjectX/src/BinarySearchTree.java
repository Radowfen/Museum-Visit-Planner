
import java.util.ArrayList;

public class BinarySearchTree {
    Node root;
    ArrayList<Integer> odaGecmisi;

    public BinarySearchTree() {
        root = null;
        odaGecmisi = new ArrayList<Integer>();
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key + " numaralı odaya hoşgeldiniz.");
            odaGecmisi.add(root.key);
            inorderRec(root.right);
        }
    }

    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node root, int key) {
        if (root == null)
            return false;

        if (root.key == key)
            return true;

        if (key < root.key)
            return searchRec(root.left, key);

        return searchRec(root.right, key);
    }

    public void printOdaGecmisi() {
        System.out.println("Gezilen Odalar:");
        for (int i = 0; i < odaGecmisi.size(); i++) {
            System.out.println(odaGecmisi.get(i));
        }
    }
}

