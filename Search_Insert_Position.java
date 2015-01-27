/**
 * This is the simplest solution lol
 */
/*
public class Solution {
    public int searchInsert(int[] A, int target) {
        for(int i = 0; i < A.length; i++){
            if(A[i] >= target)
                return i;
        }
        return A.length;
    }
}
*/
/**
 * To get better performance
 * I can do binary search
 * use lo + (hi - lo) / 2 instead of (hi + lo) / 2 to avoid (hi + lo) overflows
 */
public class Solution {
    public int searchInsert(int[] A, int target) {
        int high = A.length - 1;
        int low = 0;
        
        while(high >= low){
            int mid = low + (high - low) / 2;
            if(A[mid] == target)
                return mid;
            else if(A[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}
