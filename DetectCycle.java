public ListNode existCycle(ListNode head){
    ListNode fast = head;
    ListNode slow = head;
    
    while(fast!=null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
        if(slow == fast)
            return true;
    }
    return false;
}