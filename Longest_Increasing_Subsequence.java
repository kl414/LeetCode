/**
 * use the array to store the minimal end value of the increasing sequence
 * Also, the binarySearch returns (-(insertion point) - 1) if key is not found
 */
public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;
        
        for(int x : nums) {
            /* faster this way since it doesn't do the search all the time
            if (N < 1 || x > nums[N-1]) {
                nums[N++] = x;
            } else if ((idx = Arrays.binarySearch(nums, 0, N, x)) < 0) {
                nums[-(idx + 1)] = x;
            }
            */
            int i = Arrays.binarySearch(dp, 0, len, x);
            if(i < 0) i = -(i + 1);
            dp[i] = x;
            if(i == len) len++;
        }
        
        return len;
    }
}
