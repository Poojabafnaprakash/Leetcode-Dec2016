package LinkedList;

public class intersectionPOint {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        ListNode l2 = headB;
        int diff = 0, c1 = 0, c2 = 0;
        while(l1 != null){
            c1++;
            l1 = l1.next;
        }
        
        while(l2 != null){
            c2++;
            l2 = l2.next;
        }
        
        if(c1 < c2){
            diff = c2 - c1;
            l1 = headB;
            l2 = headA;
        }
        else{
            diff = c1 - c2;
            l2 = headB;
            l1 = headA;
        }

        for(int i=0; i<diff; i++){
            l1 = l1.next;
        }
        while(l1 != null && l2 != null){
            if(l1 == l2){
                return l1;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return null;
    }
}
