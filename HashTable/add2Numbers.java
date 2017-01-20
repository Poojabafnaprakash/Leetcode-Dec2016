package HashTable;

import java.util.HashMap;

public class add2Numbers {
	public int[] twoSum(int[] nums, int target) {
        int[] finalResult = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target - nums[i])){
                finalResult[0] = map.get(target - nums[i]);
                finalResult[1] = i;
                return finalResult;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return finalResult;
    }
}
