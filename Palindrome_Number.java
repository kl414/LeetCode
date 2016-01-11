/**
 * compare from two ends
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        
        int div = 1;
        while(x / div >= 10){
            div *= 10;
        }
        
        while(x != 0){
            int last = x % 10;
            int first = x / div;
            if(last != first) return false;
            x = x % div / 10;
            div /= 100;
        }
        
        return true;
    }
}
