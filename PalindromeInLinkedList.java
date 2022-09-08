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
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        ListNode newHead = reverseNode(middleNode(head));
        ListNode currHead = head;
        while(newHead!=null){
            if(newHead.val != currHead.val)
                return false;
            newHead = newHead.next;
            currHead = currHead.next;
        }
        return true;
    }
    
//     public ListNode findMid(ListNode head,ListNode mid){
//         if(head == null || head.next == null || head.next.next == null)
//             return mid;
//         mid = head.next;
//         head = head.next.next;
        
//         return findMid(head,mid);
//     }
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverseNode(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode newNode = reverseNode(head.next);
        ListNode toConnect = head.next;
        toConnect.next = head;
        head.next = null;
        return newNode;
    }
}