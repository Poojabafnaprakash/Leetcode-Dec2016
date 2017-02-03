package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class frequencyOfCharacterInString {
	public void freqOfCharacter(String s){		
		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i=0; i<s.length();i++){
			if(map.containsKey(s.charAt(i))){			
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);			
			}
			else{
				map.put(s.charAt(i), 1);
			}
		}		
		for(Map.Entry<Character, Integer> entry: map.entrySet()){
			if(entry.getValue() > 1){
				System.out.println(entry.getKey()); 
				break;
			}
			
			//System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	
	public static void main(String args[]){
		frequencyOfCharacterInString s = new frequencyOfCharacterInString();
		s.freqOfCharacter("oppooja");
		
	}


}
