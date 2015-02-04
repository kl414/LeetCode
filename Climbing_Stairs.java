/**
 * The key intuition to solve the problem is that given a number of stairs n, if we know the number ways to get to the points [n-1] and [n-2]  *respectively, denoted as n1 and n2 , then the total ways to get to the point [n] is n1 + n2. Because from the [n-1] point, we can take one  *single step to reach [n] and from the [n-2] point, we could take two steps to get there. There is NO overlapping between these two solution  *sets, because we differ in the final step.
 * 
 * f[n] = f[n-1] + f[n-2]
 */
public class Solution {
    public int climbStairs(int n) {
        //base case
        if(n == 0 || n == 1 || n == 2)
            return n;
            
        int one_step = 1;
        int two_steps = 2;
        int ret = 0;
        
        for(int i = 2; i < n; i++){
            ret = one_step + two_steps;
            one_step = two_steps;
            two_steps = ret;
        }
        return ret;
    }
}
