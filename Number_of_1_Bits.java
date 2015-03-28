public class Solution {
    // you need to treat n as an unsigned value
    /*
    iterate through the 32 bits to compare each bit
    1<<i means shift binary 1(01) by i times
    */
    public int hammingWeight(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++){
            if((n & (1<<i)) != 0)
                count++;
        }
        return count;
    }
}
