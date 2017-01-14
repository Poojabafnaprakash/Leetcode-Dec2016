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
        
        ListNode curr = head;
        ListNode nextNode;
        ListNode prev = null;
        
        while(curr!=null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        
        return prev;
    }
}