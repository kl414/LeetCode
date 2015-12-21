/**
 * Area depends on the lower heights
 * move lower heights to inner array to find max
 */
public class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;
        
        while(l < r){
            int area = Math.min(height[l], height[r]) * (r - l);
            max = Math.max(max, area);
            if(height[l] > height[r])
                r--;
            else
                l++;
        }
        
        return max;
    }
}
