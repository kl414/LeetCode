/**
 * using XOR to eliminate the duplicate ones
 * Note: A^A = 0, A^A^B = B
 * /
 * 
public class Solution {
    public int singleNumber(int[] A) {
        int result = 0;
        for(int i: A)
            result ^= i;
        return result;
    }
}
