package LinkedList;

public class deleteGivenNode {
	public ListNode removeElementsIterative(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode curr = dummy;
        dummy.next = head;
        
        while(curr.next != null){
            curr = curr.next;
            if(curr.val == val){
                prev.next = curr.next;
            }
            else
                prev = curr;
        }
        
        return dummy.next;
	}
	
	public ListNode removeElementsIterativeWithoutDummyNode(ListNode head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }
        ListNode curr = head;
        while(curr != null && curr.next != null){
            if(curr.next.val == val){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return head;
	}
	
	public ListNode removeElementsRecursive(ListNode head, int val) {
        if(head == null){
            return head;
        }
        head.next = removeElementsRecursive(head.next, val);
            if(head.val == val){
                return head.next;
            }
        return head;
	}
}
