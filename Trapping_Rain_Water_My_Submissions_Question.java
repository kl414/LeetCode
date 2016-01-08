/**
 * The water traped is dependent on the lower bar
 * So if A[i] < lower bar, then at least (lowerbar-A[i]) water is trapped
 */
public class Solution {
    public int trap(int[] A) {
        int left = 0;
        int right = A.length - 1;
        int water = 0;
        int lowerBar = 0;
        while(left <= right){
            if(Math.min(A[left], A[right]) > lowerBar){
                lowerBar = Math.min(A[left], A[right]);
            }
            
            if(A[left] >= A[right]){
                water += lowerBar - A[right--];
            }else{
                water += lowerBar - A[left++];
            }
        }
        
        return water;
    }
}
