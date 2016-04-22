/**
 * Basically deciding whether rob house i or not
 * if rob house i, then can't rob i+1 & i-1
 * Consider i to be 0
 * if rob house 0, then exclude nums[length - 1] (which is loop through 0 to nums.length-2)
 * if not rob 0, then just start from index 1 and do regular loop
 */
public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }
    
    public int rob(int[] nums, int start, int end) {
        int rob = 0;
        int noRob = 0;
        
        for(; start <= end; start++){
            int temp = noRob;
            
            noRob = Math.max(noRob, rob);
            
            rob = temp + nums[start];
        }
        
        return Math.max(noRob, rob);
    }
}
