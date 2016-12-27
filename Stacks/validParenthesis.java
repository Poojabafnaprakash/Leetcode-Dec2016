package Stacks;
import java.util.Stack;

public class validParenthesis {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		int value;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(' ){
				stack.push(s.charAt(i));	
			}
			else if(s.charAt(i) == ']' || s.charAt(i) == '}' || s.charAt(i) == ')' ){
				if(stack.isEmpty()){
					return false;
				}
				value = stack.pop();
				if(value == '['){
					if(s.charAt(i) != ']'){
						return false;
					}
					
				}
				else if(value == '{'){
					if(s.charAt(i) != '}'){
						return false;
					}
					
				}
				else if(value == '('){
					if(s.charAt(i) != ')'){
						return false;
					}
				}
			}
			else{
				
			}
		}
		if(!stack.isEmpty()){
			return false;
		}
		return true;
        
    }
}
