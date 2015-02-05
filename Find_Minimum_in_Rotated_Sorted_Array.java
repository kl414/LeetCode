/**
 * when the next one is less than the current one
 * then it's the first item before rotation
 */
public class Solution {
    public int findMin(int[] num) {
        if(num.length == 0) return -1;
        if(num.length == 1) return num[0];
        int min = num[0];
        for(int i = 1; i < num.length; i++){
            if(min > num[i]){
                min = num[i];
                return min;
            }
        }
        return min;
    }
}
