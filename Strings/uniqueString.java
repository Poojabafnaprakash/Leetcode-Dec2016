package Strings;

import java.util.HashMap;

public class uniqueString {
	public void checkUniqueString(String s){
		boolean flag = false;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<s.length();i++){
			if(map.containsKey(s.charAt(i))){			
				flag = true;
				break;
			}
			else{
				map.put(s.charAt(i), 1);
			}
		}
		if(flag)
			System.out.println("The string is not unique");
		else
			System.out.println("The string is unique");
		
	}
	
	public void checkUniqueBoolean(String s){
		boolean[] arr = new boolean [26];
		boolean flag = false;
		for(int i=0; i<s.length();i++){
			int value = s.charAt(i) - 'a';
			if(arr[value]){
				flag = true; break;
			}
			else{
				arr[value] = true;
			}
		}
		
		if(flag)
			System.out.println("The string is not unique");
		else
			System.out.println("The string is unique");
		
	}
	
	public void checkUniqueUsingBits(String s){
		int setBit = 0;
		boolean flag = false;
		for(int i=0; i<s.length();i++){
			int value = s.charAt(i) - 'a';
			if((setBit &(1<<value)) > 0){
				flag = true; break;
			}
			else
				setBit = setBit |(1<<value);
		}
		if(flag)
			System.out.println("The string is not unique");
		else
			System.out.println("The string is unique");
	}
	
	public static void main(String args[]){
		uniqueString s = new uniqueString();
		//s.checkUniqueString("pooja");
		//s.checkUniqueBoolean("poja");
		s.checkUniqueUsingBits("pooja");
	}

}
