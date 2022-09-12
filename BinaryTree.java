import java.util.LinkedList;
import java.util.Queue;
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

    static void postorderTraversal(Node root){
        if(root == null) return;
        inorderTraversal(root.left);
        inorderTraversal(root.left);
        System.out.println(root.data);
    }
    static int height(Node root){
        if(root == null) return 0;
        return Math.max(height(root.left),height(root.right)) + 1;
    }
    static int numNodes(Node root){
        if(root == null) return 0;
        return numNodes(root.left) + numNodes(root.right) + 1;
    }

    static int maxEle(Node root){
        if(root == null) return Integer.MIN_VALUE;

        return Math.max(root.data,Math.max(maxEle(root.left), maxEle(root.right)));
    }
    static int minEle(Node root){
        if(root == null) return Integer.MAX_VALUE;

        return Math.min(root.data,Math.min(minEle(root.left), minEle(root.right)));
    }

    static boolean isSymmetric(Node l, Node r){
        if(l == null && r == null ) return true;
        
        if(l==null || r == null) return false;
        
        return (l.data == r.data) && isSymmetric(l.left,r.right) && isSymmetric(l.right,r.left);
    }


    static void levelOrderTraversal(Node root){
        Queue<Node> que = new LinkedList<Node>();
        que.add(root);

        while(!que.isEmpty()){
            Node curr =  que.poll();
            System.out.println(curr.data);
            if(curr.left!=null)
                que.add(curr.left);
            if(curr.right!=null)
                que.add(curr.right);
        }
    }
}

class Node{
    int data;
    Node left,right;

    public Node(int data){
        this.data = data;
    }
}