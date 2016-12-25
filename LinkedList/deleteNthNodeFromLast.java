package LinkedList;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class deleteNthNodeFromLast {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode reachingPoint = head;
        int point = 0;
        
        if(curr.next == null && n == 1){
            head = null;
            return head;
        }
        
        while(curr.next != null){
            if(point == n){
                reachingPoint = reachingPoint.next;
            }
            else
                point++;
            curr = curr.next;
        }
        
        if(point == n-1){
            head = reachingPoint.next;
            reachingPoint.next = null;
        }
        else if(point < n-1){
            System.out.println("error");
            return head;
        }
        else
            reachingPoint.next = reachingPoint.next.next;
            
        return head;
        
    }
}