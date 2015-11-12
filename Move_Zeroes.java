/**
 * rearrange the array to put non-zero values front
 * then filling remaining space with zeros
 * ALWAYS CHECK FOR EDGE CASES FIRST!
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        
        if(nums == null || nums.length < 2) return;
        
        int curr = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[curr++] = nums[i];
            }
        }
        
        for(; curr < nums.length; curr++)
            nums[curr] = 0;
        
        /**
         * Below is a more natual way of thinking
         * simply keeps swapping for zero and non-zeros
         */
         /*
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[cur];
                nums[cur++] = nums[i];
                nums[i] = temp;
            }
        }
        */
    }
}
