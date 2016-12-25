package LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class reverseLL {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        
        ListNode prev = head;
        ListNode forward;
        ListNode forwardNext;
        
        forward = prev.next;
        prev.next = null;
        
        while(forward != null){
            forwardNext = forward.next;
            forward.next = prev;
            prev = forward;
            forward = forwardNext;
        }
        return prev;
    }
}