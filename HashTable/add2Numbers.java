package HashTable;

import java.util.HashMap;
// Amazon1
public class add2Numbers {
	public int[] twoSum(int[] nums, int target) {
		//Time complexity O(n)
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
	
	public int[] twoSumBruteForce(int[] nums, int target) {
		// time complexity = o(n^2)
        int[] finalResult = new int[2];
        for(int i=0; i<nums.length-1;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    finalResult[0] = i;
                    finalResult[1] = j;
                    return finalResult;
                }
            }
        }
        
        return finalResult;
    }
}
