/**
 * O(n) solution
 */
public class Solution {
    public int maxSubArray(int[] A) {
        int maxSum = A[0];
        int temp = A[0];
        
        for(int i = 1; i < A.length; i++){
            temp = Math.max(temp + A[i], A[i]);
            maxSum = Math.max(temp, maxSum);
        }
        return maxSum;
    }
}
