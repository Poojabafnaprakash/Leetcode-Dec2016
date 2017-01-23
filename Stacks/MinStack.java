package Stacks;

import java.util.Stack;

public class MinStack {
	long min;
    Stack<Long> stck;

    /** initialize your data structure here. */
    public MinStack() {
        stck = new Stack<Long>();
    }
    
    public void push(int x) {
        Long x1 = new Long(x);
        if(stck.empty()){
            stck.push(x1);
            min = x1;
            return;
        }
        
            if(x1 < min){
                stck.push(2*x1 - min);
                min = x1;
            }
            else{
                stck.push(x1);
            }
        
        
    }
    
    public void pop() {
       if(stck.empty()) return;
       if(stck.peek() < min){
           min = 2*min - stck.pop();
       }
       else{
           stck.pop();
       }
        
    }
    
    public int top() {
        if(stck.empty()) return 0;
        long x = stck.peek();
            return (int)x;
    }
    
    public int getMin() {
       return (int)min;
    }
}
