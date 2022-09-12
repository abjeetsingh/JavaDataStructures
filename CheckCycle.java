/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode meet = existCycle(head);
        if(meet == null) return null;
        ListNode cycle = head;
        
        while(cycle != meet)
        {
            cycle = cycle.next;
            meet = meet.next;
        }
        return meet;
    }
    
    public ListNode existCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast)
                return slow;
        }
        return null;
    }
}