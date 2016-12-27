package Queues;

class stacksUsingQueues_class {
	QueuesUsingLL q1 = new QueuesUsingLL();
	int count = 0;
	
	void push(int d){
		q1.enQueue(d);
		count++;
		for(int i = 0; i < count - 1; i++){
			q1.enQueue(q1.deQueue());			
		}		
	}
	
	int pop(){
		return q1.deQueue();
	}
	
	void display(){
		q1.display(q1.head);
	}

}

public class stacksUsingQueues{
	public static void main(String args[]){
		stacksUsingQueues_class s = new stacksUsingQueues_class();
		s.push(1);
		s.push(2);
		s.push(3);
//		s.display();
		s.pop();
		s.display();
	}
		
}

