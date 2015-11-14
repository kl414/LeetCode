/**
 * By doing XOR over all the numbers, we get the bits of (distinct1 XOR distinct2)
 * The set bit(1) in (distinct1 XOR distinct2) represents where the bits are different
 * picking any of these set bit, the numbers can be partition to two groups
 * each of the two groups contain a distinct number
 * Do another XOR over the two groups, what's left are the distinct numbers
 */
public class Solution {
    public int[] singleNumber(int[] nums) {
        
        int diff = 0;
        for(int num: nums){
            diff ^= num;
        }
        
        //Getting the rightmost set bit by two's compliments
        diff &= -diff;
        
        int[] result = {0, 0};
        for(int num: nums){
            if((num & diff) == 0){
                result[0] ^= num;
            }else{
                result[1] ^= num;
            }
        }
        
        return result;
    }
}
