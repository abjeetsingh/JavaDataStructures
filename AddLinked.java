/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class AddLinked{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        listNode l3 = new ListNode(0);
        int carry = 0;
        while(l1.next != null || l2.next != null){
            int l1Num = (l1 != null)? l1.val : 0;
            int l2Num = (l2 != null)? l2.val : 0;
            
            int theValue = l1Num + l2Num + carry;
            int lastDigit = theValue % 10;
            carry = theValue/10;

            ListNode temp = new ListNode(lastDigit);
            l3.next = temp;

            if (l1!=null) l1 = l1.next;
            if (l2!=null) l2 = l2.next;
            l3 = l3.next;
        }
        if(carry ==1){
            ListNode temp = new ListNode(1);
            l3 = temp;
            l3.next = l3;
        }
        return l3.next;
    } 
}