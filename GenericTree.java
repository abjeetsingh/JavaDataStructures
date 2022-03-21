import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Queue;
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

    public static int MaximumInTree(Node recievedNode){
        int max = Integer.MIN_VALUE;

        for (Node child: recievedNode.children)
            max = Math.max(max,MaximumInTree(child));
            
        max = Math.max(max,recievedNode.data);


        return max;
    }

    public static int height(Node recievedNode){
        int hght = -1;
        for(Node child:recievedNode.children){
            int ch = height(child);
            hght = Math.max(hght,ch);
        }
        hght += 1;
        return hght;
    }

    public static void Traversal(Node recievedNode){
        System.out.println("Pre Node" + recievedNode.data);

        for (Node child: recievedNode.children){
            System.out.println("Pre Edge" + recievedNode.data +  "  " + child.data);
            Traversal(child);        
            System.out.println("Post Edge" + recievedNode.data +  "  " + child.data);
        }
        System.out.println("Post Edge" + recievedNode.data );
    }

    public static void levelTraversal(Node recievedNode){
        Queue<Node> qt = new ArrayDeque<>();
        qt.add(recievedNode);

        while(qt.size() > 0){
            recievedNode = qt.remove();
            System.out.println(recievedNode.data + " ");

            for(Node child:recievedNode.children)
                qt.add(child);
        }

        System.out.println(" . ");
    }

    public static void levelTraversalLinewise(Node recievedNode){
        Queue<Node> cq = new ArrayDeque<>();
        cq.add(recievedNode);
        while(cq.size() > 0){
            recievedNode = cq.remove();
            System.out.print(recievedNode.data + "\t");
            for(Node child:recievedNode.children){
                cq.add(child);
            }
        }
    }

    public static void levelTraversalLineWiseZZ(Node recievedNode){
        Stack<Node> ms = new Stack<>();
        ms.push(recievedNode)

        Stack<Node> cs = new Stack<>();
        int level = 1;

        while(ms.size()>0){
            node = ms.pop();
            System.out.println(node.data + " ");

            if((level & 1) == 1){
                for(int i=0; i< node.children.size(); ++i ){
                    Node child = recievedNode.children.get(i);
                    cs.push(child);
                }
            }
            else{
                for(int i=node.children.size()-1; i>=0 ; --i){
                    Node child = recievedNode.children.get(i);
                    cs.push(child);
                }
            }
            if(ms.size() == 0){
                ms = cs;
                cs = new Stack<>();
                level++;
                System.out.println();
            }
        }
    }

    public static void MirrorOfTree(Node recievedNode){
        // making a tree
        Stack<Node> cs = new Stack<>();
        
        Node Root;

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
        // display(root);

        //Size of tree

        // int size = TreeSize(root);
        // System.out.println(size);

        // int maximum = MaximumInTree(root);
        // System.out.println(maximum);

        // System.out.println(root.data);
        
        // System.out.println(height(root));

        // Traversal(root);

        // levelTraversal(root);

        // levelTraversalLinewise(root);
    }
}