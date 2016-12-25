package LinkedList;

// Definition for singly-linked list.
 class ListNode {
    int val;
    ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
 
public class cycleDetection {
    public boolean hasCycle(ListNode head) {
        ListNode hare = head;
        ListNode tortoise = head;
        
        while(hare != null && tortoise != null && tortoise.next != null){
            hare = hare.next;
            tortoise = tortoise.next.next;
            if(hare == tortoise){
                return true;
            }
        }
        
        return false;
        
        
    }
}