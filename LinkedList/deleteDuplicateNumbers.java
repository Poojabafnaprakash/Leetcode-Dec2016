package LinkedList;

public class deleteDuplicateNumbers {
	public ListNode deleteDuplicatesIterative(ListNode head) {
        ListNode curr = head;
        if(head == null || head.next == null){
            return head;
        }
        while(curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        
        return head;
    }
	public ListNode deleteDuplicatesRecursive(ListNode head) {
        if(head == null || head.next == null){
             return head;
        }
        head.next = deleteDuplicatesRecursive(head.next);
        return (head.val == head.next.val) ? head.next:head;
	}
        
}
