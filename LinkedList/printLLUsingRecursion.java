package LinkedList;


//Print elements of a linked list on console 
//head pointer input could be NULL as well for empty list
//Node is defined as 

class Node {
   int data;
   Node next;
}

public class printLLUsingRecursion {
	void PrintFrontRecursion(Node head) {
		  
		  if(head == null)
		      return;
		  System.out.println(head.data);
		  
		  PrintFrontRecursion(head.next);


		}
	

	void ReversePrint(Node head) {
	  if(head == null)
	      return;
	    ReversePrint(head.next);
	    System.out.println(head.data);
	
	}
}




  

