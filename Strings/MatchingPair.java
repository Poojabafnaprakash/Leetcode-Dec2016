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
	
	public int matchingNew(String s){
		int pos = -1;
		if (!Character.isLowerCase(s.charAt(0)) || s.length() == 0)
			return pos;
		Stack<Character> stack = new Stack<Character>();
		stack.push(s.charAt(0));
		for(int i=1; i<s.length(); i++){
			if(Character.isLowerCase(s.charAt(i))){
				char c = stack.peek();
				if(c - 32 == s.charAt(i)){
					stack.pop();
					pos = i;
				}
				else{
					return pos;
				}
			}
			else{
				stack.push(s.charAt(i));
			}
		}
		if (stack.isEmpty())
			return s.length() - 1;
		else
			return pos;
	}
	
	public int frequencySort(String s) {
	    int pos = -1;
	    int index = 0;
	    Stack<Character> stack = new Stack<Character>();
	    stack.push(s.charAt(0));
	    for(int i=1; i<s.length(); i++){
	     if(!stack.isEmpty()){
	      if(Character.isLowerCase(s.charAt(i)) && Character.isUpperCase(stack.peek())){
	       index = stack.size()-2;
	       if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(stack.peek())){
	        stack.pop();
	        pos = i;
	       }
	       else{
	        while(index>=0){
	         if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(stack.get(index))){
	          stack.pop();
	                pos = i;
	             break;
	              }
	          index--;
	        }
	       
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
	public int matchingPairs(String s){
		int pos = -1;
		if (Character.isLowerCase(s.charAt(0)) || s.length() == 0)
			return pos;
		int value = 0;
		int[] arr = new int[26];
		for(int i=0; i<s.length();i++){ 
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch))
				 value = ch - 'A';
			else
				 value = ch - 'a';
			if(Character.isLowerCase(s.charAt(i)) && arr[value]!=0 && (ch == Character.toLowerCase(s.charAt(i-1)))){
				arr[value]--;
				pos = i;
			}
			else{
				arr[value] += 1;
			}
		}
		
		return pos;
	}
	public static void main(String args[]){
		MatchingPair obj = new MatchingPair();
		//System.out.println(obj.matching("ABbba"));
		//System.out.println(obj.matchingNew("ACa"));
		//System.out.println(obj.frequencySort("ABbba"));
		System.out.println(obj.matchingPairs("AaBb"));
	}
}
