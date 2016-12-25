package Stacks;

public class stacks {
	int size = 10;
	int[] arr = new int[size];
	int top = -1;
	
	void push(int x){
		if(isFull()){
			System.out.println("stack is full");
		}
		else{
			top++;
			arr[top] = x;
			
		}
		
		
	}
	
	int pop(){
		int value;
		if(isEmpty()){
			System.out.println("stack is empty");
			return 0;
		}
		else{
			value = arr[top];
			top--;
			return value;
		}
	}
	
	boolean isEmpty(){
		
		if(top == -1){
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean isFull(){
		
		return top == size - 1;
	}
	
	void display(){	
		for(int i=0; i<=top; i++ ){
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String args[]){
		stacks s = new stacks();
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		s.display();
	}
	
	

}
