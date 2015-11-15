/**
 * The product at i is (product of numbers before i) * (product of numbers after i)
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                output[i] = 1;
            } else {
                output[i] = output[i - 1] * nums[i - 1];
            }
        }

        for (int j = nums.length - 1, t = 1; j >= 0; j--) {
            
            output[j] = output[j] * t;
            t = t * nums[j];
        }

        return output;
    }
}
