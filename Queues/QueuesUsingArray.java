package Queues;

public class QueuesUsingArray {
	int size = 5;
	int arr[] = new int[size];
	int front = -1;
	int tail = -1;
	
	void display(){
		if(front == -1|| tail == -1){
			return;
		}
		else if(front > tail){
			for(int i = front;i<=size - 1;i++){
				System.out.println(arr[i]);
			}
			for(int i = 0;i<=tail;i++){
				System.out.println(arr[i]);
			}
		}
		else{
			for(int i = front;i<=tail;i++){
				System.out.println(arr[i]);
			}
		}
		
	}
	
	void enQueue(int d){
		if(front == (tail+1)%size){
			System.out.println("Queue is full");
		}
		else{
				tail = (tail+1) % size;
				arr[tail] = d;
				if(front == -1)
					front++;						
		}
		
				
	}
	
	int deQueue(){
		int value;
		if(tail == -1 || front == -1){
			System.out.println("no value in Queue");
			return 0;
		}
		else{			
			value = arr[front];	
			if(tail == front){
				tail = front = -1;
			}
			else{
				front = (front+1) % size;
			}
			return value;
		}
	}
	
	
	public static void main(String args[]){
		QueuesUsingArray queue = new QueuesUsingArray();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);
//		queue.enQueue(6);
		queue.display();
		System.out.println("deQueued element" + queue.deQueue());
		queue.display();
		queue.enQueue(6);
		queue.enQueue(7);
		queue.display();
		
	}

}
