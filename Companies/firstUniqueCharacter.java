package Companies;

import java.util.LinkedHashMap;
import java.util.Map;

class myList{
    int freq;
    int position = -1;
}

public class firstUniqueCharacter {
	public int firstUniqueCharUsingArray(String s){
		int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<s.length(); i++){
            if((freq[s.charAt(i) -'a']) == 1){
                return i;
            }
        }
        return -1;
	}
	public int firstUniqCharUsingMap(String s) {
        Map<Character, myList> map = new LinkedHashMap<Character, myList>();
        for(int i=0; i<s.length(); i++){
            myList obj = new myList();
            if(map.containsKey(s.charAt(i))){
                obj = map.get(s.charAt(i));
                obj.freq += 1;
                obj.position = -1;
                map.put(s.charAt(i), obj);
                
            }
            else{
                obj.freq = 1;
                obj.position = i;
                map.put(s.charAt(i), obj);
            }
        }
        myList obj = new myList();
        for(Map.Entry<Character,myList> entry: map.entrySet()){
            obj = entry.getValue();
            if(obj.freq == 1)
               break;
        }
        return obj.position;
    }
	
	public static void main(String args[]){
		firstUniqueCharacter obj = new firstUniqueCharacter();
		obj.firstUniqCharUsingMap("abba");
	}
}
