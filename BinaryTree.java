import java.util.Scanner;

class BinaryTree{
    static Scanner scn = null;
    public static void main(String[] args) {
        scn  = new Scanner(System.in);
        Node root = createTree();
    }
    public static Node createTree(){
        Node root = null;

        System.out.println("enter data:");
        int data = scn.nextInt();
        if(data == -1) return null;

        root = new Node(data);
        System.out.println("Enter the left value of -> "+  root.data);
        root.left = createTree();

        System.out.println("Enter the right value of -> "+  root.data);
        root.right = createTree();

        return root;
    }

    static void inorderTraversal(Node root){
        if(root == null) return;
        inorderTraversal(root.left);
        System.out.println(root.data);
        inorderTraversal(root.left);
    }

    static void preorderTraversal(Node root){
        if(root == null) return;
        System.out.println(root.data);
        inorderTraversal(root.left);
        inorderTraversal(root.left);
    }
}

class Node{
    int data;
    Node left,right;

    public Node(int data){
        this.data = data;
    }
}