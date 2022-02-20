

public class LinkedlistIntro{
    public class Node{
        int data;
        Node next;
    }
    public static class LinkedList{ 
        Node head;
        Node tail;
        int size;
        

        void AddLast(int data){
            Node temp = new Node();
            temp.data = data;
            temp.next = null;
    
            if(size = 0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
    }

    
}