/*
  The maximum product is either the product of the three largest numbers 
  or product of two smallest number and the largest number. (Neg * Neg * Pos)
*/

// O(1) space, O(n) time
public class Solution {
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        
        //max1 being the largest, min1 being the smallest
        for(int n : nums){
            if(n > max1){
                max3 = max2;
                max2 = max1;
                max1 = n;
            }else if(n > max2){
                max3 = max2;
                max2 = n;
            }else if(n > max3){
                max3 = n;
            }
            
            if(n < min1){
                min2 = min1;
                min1 = n;
            }else if (n < min2){
                min2 = n;
            }
        }
        
        return Math.max(max1*max2*max3, min1*min2*max1);
    }
}

// O(nlogn) time, using sort is eaiser but slower too
public class Solution {
    public int maximumProduct(int[] nums) {
        
        Arrays.sort(nums);
        int length = nums.length;
        
        return Math.max(nums[length-1]*nums[length-2]*nums[length-3], nums[length-1]*nums[0]*nums[1]);
    }
}
