package HashTable;

import java.util.HashMap;
import java.util.Map;

public class anagramOrNot {
	public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (--letters[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
	
	public boolean isAnagramUsingHashMap(String s, String t) {
        if(s.length() != t.length())
            return false;
       Map<Character, Integer> map = new HashMap<Character, Integer>();
         for (int i = 0; i < s.length(); i++) {
             char c = s.charAt(i);
             if (map.containsKey(c)) {
                 map.put(c, map.get(c) + 1);
             } else {
                 map.put(c, 1);
             }
         }
         for (int i = 0; i < t.length(); i++) {
             char c = t.charAt(i);
             if (map.containsKey(c) && map.get(c) > 0) {
                 map.put(c, map.get(c) - 1);
             } else {
                 return false;
             }
         }
         // iterate map
         for (Integer value : map.values()) {
             if (value != 0) {
                 return false;
             }
         }
     return true;
    }
}
