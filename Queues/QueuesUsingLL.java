package Queues;

class Node{
	int data = 0;
	Node next = null;
	Node(int d){
		this.data = d;
	}
}

public class QueuesUsingLL {
	Node head;
	
	void display(Node curr){
		if(curr == null)
			System.out.println("No element");
		else{
			System.out.println(curr.data);
			if(curr.next != null)
				display(curr.next);
		}
		
	}
	
	void enQueue(int d){
		Node curr = head;
		if(head == null){
			Node node = new Node(d);
			head = node;
		}
		else{
			while(curr.next != null){
				curr = curr.next;
			}
			Node node = new Node(d);
			curr.next = node;
		}		
	}
	
	int deQueue(){
		if(head == null){
			return 0;
		}
		else{
			Node curr = head;
			head = head.next;
			curr.next = null;
			return curr.data;
		}
	}
	
	boolean isEmpty(){
		return head == null;
	}
	
	public static void main(String args[]){
		QueuesUsingLL queue = new QueuesUsingLL();
		queue.display(queue.head);
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		System.out.println("deQueued element" + queue.deQueue());
		queue.display(queue.head);
		
	}

}
