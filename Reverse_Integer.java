/**
 * for overflow checking, it can also be done by checking against
 * INT_MAXVALUE & INT_MINVALUE
 */
public class Solution {
    public int reverse(int x) {
        int res = 0;
        
        while(x != 0){
            int tail = x % 10;
            int newRes = res * 10 + tail;
            
            //reverse the process to check if overflow
            if( (newRes - tail) / 10 != res) return 0;
            
            res = newRes;
            x /= 10;
        }
        
        return res;
    }
}
