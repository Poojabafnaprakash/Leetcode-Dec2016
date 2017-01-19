package LinkedList;

public class add2Numbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        int carry = 0;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode result = new ListNode(0);
        ListNode curr3 = result;
        while(curr1!=null || curr2!=null){
            
            if(curr1 != null){
                sum += curr1.val;
                curr1 = curr1.next;
            
            }
            
            if(curr2 != null){
                sum += curr2.val;
                curr2 = curr2.next;
            }
                      
            carry = sum/10;
            curr3.next = new ListNode(sum % 10);
            curr3 = curr3.next;
            sum = carry;
        }
        
        if(sum > 0 && curr1==null && curr2==null){
            curr3.next = new ListNode(sum);
            curr3 = curr3.next;
        }
        return result.next;
        
    }
}
