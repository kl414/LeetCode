/**
 * It's counting on the actual number, not index
 * Binary search
 */
public class Solution {
    public int findDuplicate(int[] nums) {
        int lo = 1;
        int hi = nums.length - 1;
        
        while(lo < hi){
            int mid = lo + (hi - lo) / 2;
            int count = 0;
            for(int num: nums){
                if(num <= mid){
                    count++;
                }
            }
            if(count <= mid)
                lo = mid + 1;
            else
                hi = mid;
        }
        
        return lo;
    }
}
