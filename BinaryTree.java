import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
        que.add(null);
        while(!que.isEmpty()){
            Node curr =  que.poll();
            // the if block is for proper next line representation. 
            if(curr == null){
                if(que.isEmpty()) return;
                que.add(null);
                System.err.println();
                continue;
            }
            System.out.println(curr.data);
            if(curr.left!=null)
                que.add(curr.left);
            if(curr.right!=null)
                que.add(curr.right);
        }
    }

    public static List<Integer> leftView(Node root){
        List<Node> values = new ArrayList<Node>();
        leftViewHelper(root, 0, values);
        return values;

    }

    public static void leftViewHelper(Node root, int level, List<Node> values){
        if(root == null) return;
        if(values.get(level) == null)
            values.add(root);
        leftViewHelper(root.left, level+1, values);
        leftViewHelper(root.right, level+1, values);
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        helper(root,values,0);
        return values;
        
    }
    
    
    
}

class Node{
    int data;
    Node left,right;

    public Node(int data){
        this.data = data;
    }
}