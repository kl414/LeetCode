/**
 * Divide the number to 2's and 3's
 * since 4 can be divided into 2*2 and 2*(f-2) >= f yields f>= 4
 * favor 3 than 2 since 6 = 2+2+2 = 3+3 and 3*3 > 2*2*2
 */
public class Solution {
    public int integerBreak(int n) {
        if(n < 4)
            return n - 1;
        else if(n%3 == 0)
            return (int)Math.pow(3, n/3);
        else if(n%3 == 1)
            return 2 * 2 * (int) Math.pow(3, (n - 4) / 3);
        else 
            return 2 * (int) Math.pow(3, n/3);
    }
}
