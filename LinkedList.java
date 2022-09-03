import java.util.*;

class LinkedList{
    public static class Node{
        int data;
        Node next;

        Node(){
            data =0;
            next = null;
        }
    }
    public static class linked{
        Node head;
        Node tail;
        int size;
        linked(){
            head = null;
            tail = null;
            size=0;
        }
    

        public static void addlast(int value){
            Node temp = new Node();
            temp.data = value;
            temp.next = null;
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
    }
}