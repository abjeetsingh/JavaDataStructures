import java.util.ArrayList;
import java.util.Stack;

class GenericTree{

    class Node{
        int data;
        ArrayList<Node> children= new ArrayList<>();
    }

    public static void main(String[] args) {
        int[] arr = {10,20,50,-1,60-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Stack<Node> stac = new stack<>();
        Node root;
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
    
    
    }
}