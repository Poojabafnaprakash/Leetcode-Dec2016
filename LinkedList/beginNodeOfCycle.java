package LinkedList;

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
public class beginNodeOfCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode hare = head;
        ListNode tortoise = head;
        boolean hasCycle = false;
        
        while(hare != null && tortoise != null && tortoise.next != null){
            hare = hare.next;
            tortoise = tortoise.next.next;
            if(tortoise == hare){
                hasCycle = true;
                break;
            }
        }
        
        if(hasCycle){
            hare = head;
            while(hare != tortoise){
                hare = hare.next;
                tortoise = tortoise.next;
            }
            return hare;
        }
        else
            return null;
        
    }
}