package Arrays;

public class removeDuplicates {
	public int returnLengthAfterRemoveDuplicatesOfSortedArray(int[] nums) {
        if(nums.length < 0) return 0;
        int k = 1;
        for(int i=0;i<nums.length - 1; i++){
            if(nums[i] != nums[i+1]){
                nums[k] = nums[i+1];
                k++;
            }
        }
        return k;
        
    }
	
	public int removeAllDuplicateElementsFromUnsortedArray(int[] nums, int val) {
        if(nums.length==0)
            return 0;
        int end=nums.length-1;
        int front=0;
        while(front<=end){
            if(nums[front]==val){
                if(nums[end]==val){
                    end--;
                }
                else{
                    nums[front] = nums[end];
                    front++;
                    end--;
                }
            }
            else{
                front++;
            }
        }
        
        return front;
        
    }

}
