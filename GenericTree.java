import java.util.ArrayList;
import java.util.Stack;

class GenericTree{

    public static class Node{
        int data;
        ArrayList<Node> children= new ArrayList<>();
    }

    public static void display(Node recievedNode){
        String str = recievedNode.data + " --> ";
        for (Node child: recievedNode.children)
            str += child.data + ", ";
        str += ".";
        System.out.println(str);

        for(Node child: recievedNode.children) 
            display(child);
    }

    public static int TreeSize(Node recievedNode){
        int s = 0;
        for (Node child:recievedNode.children){
            int cs = TreeSize(child);
            s += cs;
        }
        s += 1;
        return s;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Stack<Node> stac = new Stack<>();
        Node root = null;

        // Generic Tree Constructor
        for(int i:arr){
            if(i == -1)
                stac.pop();
            else{
                Node t = new Node();
                t.data  = i;

                if(stac.size() > 0)
                    stac.peek().children.add(t);
                else
                    root = t;

                stac.push(t);
            }
            
        }
        // Generic Tree Constructor

        // Display Generic Tree
        display(root);

        //Size of tree

        int size = TreeSize(root);
        System.out.println(size);
    }
}