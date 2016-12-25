package Stacks;

class Node{
	int data = 0;
	Node next = null;
	Node(int d){
		this.data = d;
	}
}

public class stacksLL {
	
	int length = 0;
	Node head;
	
	
	void push(int d){
		Node node = new Node(d);
		if(head == null){
			head = node;
			length++;
		}
		else{
			node.next = head;
			head = node;
			length++;
		}
	}
	
	Node pop(){
		Node curr = head;
		if(!isEmpty()){
			head = head.next;
			curr.next = null;
			length--;
		}
		return curr;
	}
	
	 void display(Node node){
		if(node==null){
			System.out.println("no element");
		}
		else{
			System.out.println(node.data);
			if(node.next != null)
				display(node.next);
		}
		
	}
	
	boolean isEmpty(){
		return length == 0;
	}
	
	public static void main(String args[]){
		stacksLL s = new stacksLL();
		s.display(s.head);
		s.push(1);
		s.push(2);
		s.display(s.head);
		System.out.println("poped element" + s.pop().data);
		s.display(s.head);
		s.pop();
		s.display(s.head);
		s.pop();
		s.pop();
		
	}

}
