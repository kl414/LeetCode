/**
 * 
    If num[i-1] < num[i] > num[i+1], then num[i] is peak
    If num[i-1] < num[i] < num[i+1], then num[i+1...n-1] must contains a peak
    If num[i-1] > num[i] > num[i+1], then num[0...i-1] must contains a peak
    If num[i-1] > num[i] < num[i+1], then both sides have peak (n is num.length)
*/
public class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 0)
            return -1;
            
        int lo = 0;
        int hi = nums.length - 1;
        
        
        while(lo < hi){
            if(lo + 1 == hi){
                if(nums[lo] > nums[hi])
                    return lo;
                else
                    return hi;
            }
            
            int mid = lo + (hi - lo) / 2;
            if(nums[mid-1] < nums[mid]){
                if(nums[mid] > nums[mid+1]){
                    return mid;
                }else{
                    lo = mid + 1;
                }
            }else{
                //use left sides for two situations when num[i-1] > num[i]
                hi = mid - 1;
            }
        }
        
        return lo;
    }
}
