package Companies;

 // Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
public class palindromeLinkedList {
	//time complexity: O(n) and spaceComplexity
	
	public ListNode reverse(ListNode node){
        ListNode prev = null;
        ListNode forward = null;
        while(node!=null){
            forward = node.next;
            node.next = prev;
            prev = node;
            node = forward;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode curr1 = head;
        ListNode curr2 = head;
        if(head==null || head.next==null)
            return true;
        while(curr2.next!=null && curr2.next.next!=null){
            curr1 = curr1.next;
            curr2 = curr2.next.next;
        }
        ListNode rhead = reverse(curr1.next);
        while(rhead != null){
            if(rhead.val != head.val) return false;
            else{
                rhead = rhead.next;
                head = head.next;
            }
        }
        return true;
    }
}
