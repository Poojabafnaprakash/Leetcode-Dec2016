package Stacks;

class queuesUsingStacks {
	int count = 0;
	stacks s1;
	stacks s2;
	public queuesUsingStacks(){
		 s1 = new stacks();
		 s2 = new stacks();
	}
	
	public void enQueue(int d){
		for(int i=0; i< count; i++)
			s2.push(s1.pop());
		s1.push(d);
		for(int i=0; i< count; i++)
			s1.push(s2.pop());
		count++;
	}
	
	int deQueue(){
		return s1.pop();	
	}
	
	void display(){
		s1.display();
	}

}

public class queuesUsingStacks_Driver{
	public static void main(String args[]){
		queuesUsingStacks q = new queuesUsingStacks();
		q.enQueue(11);
		q.enQueue(12);
		q.enQueue(13);
		q.display();
		q.deQueue();
		q.display();
	}
	
}
