
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. kata hoşgeldiniz!");
        System.out.println("101 - 105 numaralı odalardan birine girebilirsiniz.");
        System.out.println("2. veya 3. kata çıkmak için 2 veya 3 tuşuna basın.");

        int choice = scanner.nextInt();

        while (choice != 2 && choice != 3) {
            if (choice == 101 || choice == 105) {
                if (tree.search(choice)) {
                    System.out.println("Bu odaya daha önce girdiniz.");
                } else {
                    tree.insert(choice);
                    tree.inorder();

                    System.out.println("102, 103 ve 104 numaralı odalara girebilirsiniz.");
                    System.out.println("Diğer odalara girmek için oda numarasını girin.");
                }
            } else {
                System.out.println("Geçersiz oda numarasını girdiniz.");
            }
            choice = scanner.nextInt();
        }
        if (choice == 2) {
            System.out.println("2. kata hoşgeldiniz!");
            System.out.println("201 veya 205 numaralı odalardan birine girebilirsiniz.");

            choice = scanner.nextInt();

            while (choice != 201 && choice != 205) {
                System.out.println("Geçersiz oda numarasısı girdiniz.");
                choice = scanner.nextInt();
            }

            if (tree.search(choice)) {
                System.out.println("Bu odaya daha önce girdiniz.");
            } else {
                tree.insert(choice);
                tree.inorder();

                if (choice == 201) {
                    System.out.println("202, 203 ve 204 numaralı odalara girebilirsiniz.");
                } else {
                    System.out.println("206 ve 207 numaralı odalara girebilirsiniz.");
                }
                System.out.println("Diğer odalara girmek için oda numarasını girin.");

                choice = scanner.nextInt();

                while (choice != 202 && choice != 203 && choice != 204 && choice != 206 && choice != 207) {
                    System.out.println("Geçersiz oda numarasısı girdiniz.");
                    choice = scanner.nextInt();
                }

                if (tree.search(choice)) {
                    System.out.println("Bu odaya daha önce girdiniz.");
                } else {
                    tree.insert(choice);
                    tree.inorder();
                    System.out.println("3. kata çıkmak için 3 tuşuna basın.");
                }
            }
        } else {
            System.out.println("3. kata hoşgeldiniz!");
            System.out.println("301 veya 305 numaralı odalardan birine girebilirsiniz.");

            choice = scanner.nextInt();

            while (choice != 301 && choice != 305) {
                System.out.println("Geçersiz oda numarasısı girdiniz.");
                choice = scanner.nextInt();
            }

            if (tree.search(choice)) {
                System.out.println("Bu odaya daha önce girdiniz.");
            } else {
                tree.insert(choice);
                tree.inorder();

                if (choice == 301) {
                    System.out.println("302, 303 ve 304 numaralı odalara girebilirsiniz.");
                } else {
                    System.out.println("306 ve 307 numaralı odalara girebilirsiniz.");
                }
                System.out.println("Diğer odalara girmek için oda numarasını girin.");

                choice = scanner.nextInt();

                while (choice != 302 && choice != 303 && choice != 304 && choice != 306 && choice != 307) {
                    System.out.println("Geçersiz oda numarasısı girdiniz.");
                    choice = scanner.nextInt();
                }

                if (tree.search(choice)) {
                    System.out.println("Bu odaya daha önce girdiniz.");
                } else {
                    tree.insert(choice);
                    tree.inorder();
                }
            }
        }
    }
}

