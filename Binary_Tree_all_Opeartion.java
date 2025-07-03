import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
}

public class BST {
    static Scanner sc = new Scanner(System.in);

    static Node insert(Node root, int x) {
        if (root == null)
            return new Node(x);
        if (x <= root.data)
            root.left = insert(root.left, x);
        else
            root.right = insert(root.right, x);
        return root;
    }

    static boolean search(Node root, int x) {
        if (root == null)
            return false;
        if (x == root.data)
            return true;
        if (x < root.data)
            return search(root.left, x);
        return search(root.right, x);
    }

    static boolean searchIterative(Node root, int x) {
        while (root != null) {
            if (x == root.data)
                return true;
            root = (x < root.data) ? root.left : root.right;
        }
        return false;
    }

    static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    static void postorderIterative(Node root) {
        if (root == null) return;

        Stack<Node> s1 = new Stack<>();
        Stac
