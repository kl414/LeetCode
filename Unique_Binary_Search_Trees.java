/**
 * This is a dynamic programming problem.
 * 
 * Let's break it down:
 * a[n] = number of unique BST
 * Formula: a[n] = a[0] * a[n-1] + a[1] * a[n-2] + ... + a[n-1] * a[0]
 * For instance, a[1] * a[n-2] means put 2 at root, 1 on left, 3...n on right
 * So it adds from 1 to n
 */
 
public class Solution {
    public int numTrees(int n) {
        
        int dp[] = new int[n+1];
        dp[0] = 1;
        
        //i is the 'n' in each iteration
        for(int i = 1; i < n + 1; i++){
            dp[i] = 0;
            for(int j = 0; j < i; j++){
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        
        return dp[n];
    }
}
