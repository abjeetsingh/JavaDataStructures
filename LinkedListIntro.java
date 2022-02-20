

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
        void Display(){
            Node temp = new Node();
            temp = tail;
            int i=0;
            while(temp.next != null){
                System.out.println("Record"+i+"is value = "+temp.data);
                ++i;
            }
        }

        int removeFirst(){
            if(head == tail)
                System.out.println("UNDERFLOW ERROR");
            else if(size == 1){
                int removerElement = head.data;
                temp = head = null;
                size--;
            }
            else{
                Node temp  = new Node();
                while(temp.next != head)
                    temp = temp.next;
                int removerElement = head.data;
                head = temp;
                size --;
                return removerElement;
            }
        }
    }
    
    
}