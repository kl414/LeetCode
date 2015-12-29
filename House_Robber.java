/**
 * DP problem
 * maintain previous amount of money for robbing and not robbing the prev house
 * if choose to rob the current one, then it means noRob for last one
 * therefore robCurrent will be noRobPrev + nums[i]
 * And choose not to rob the current house will be simple
 * 
 * I just didn't use extra two variable to represent prev and curr
 * so the code may look a bit confusing
 */
public class Solution {
    public int rob(int[] nums) {
        int rob = 0;
        int noRob = 0;
        
        for(int num: nums){
            int temp = noRob;
            
            noRob = Math.max(noRob, rob);
            
            rob = temp + num;
        }
        
        return Math.max(noRob, rob);
    }
}
