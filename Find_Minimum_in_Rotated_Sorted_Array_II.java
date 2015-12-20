public class Solution {
    public int findMin(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        int mid;
        
        while(lo < hi){
            //use this instead of (hi + lo) / 2 to avoid overflow
            mid = lo + (hi - lo) / 2;
            if(nums[mid] > nums[hi]){
                lo = mid + 1;
            }else if(nums[mid] < nums[hi]){
                hi = mid;
            }else{
                hi--;
            }
        }
        
        return nums[lo];
    }
}
