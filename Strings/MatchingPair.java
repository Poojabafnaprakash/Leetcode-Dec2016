package Strings;

import java.util.Stack;

public class MatchingPair {
	public int matching(String s){
		int pos = -1;
		Stack<Character> stack = new Stack<Character>();
		stack.push(s.charAt(0));
		for(int i=1; i<s.length(); i++){
			if(!stack.isEmpty()){
				if(Character.isLowerCase(s.charAt(i)) && Character.isUpperCase(stack.peek())){
					if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(stack.peek())){
						stack.pop();
						pos = i;
					}
					else{
						break;
					}
				}
				else{
					stack.push(s.charAt(i));
				}
			}
			else{
				stack.push(s.charAt(i));
			}
		}
		return pos;
	}
	
	
	public static void main(String args[]){
		MatchingPair obj = new MatchingPair();
		System.out.println(obj.matching("ABba"));
	}
}
