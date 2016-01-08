/**
 * Trailing zeros can only be produced by 2 and 5
 * And there are always more 2s than 5s
 * so counting the number of prime factor 5 can determine the number of trailing zeros
 * numbers like 25, 125 can have multiple 5s, so need to exclude multiple of 5 as well
 */
public class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while(n > 0){
            count += n / 5;
            n /= 5;
        }
        return count;
    }
}
