/**
 * use 32-bit integer to represent each letter
 * ex. 0th bit is 'a', 1st bit is 'b', etc
 * and two string without common letter should have 0 from AND operation
 * 1 << (words[i].charAt(j) - 'a') means shift 1 left by (words[i].charAt(j) - 'a') locations
 * | is inclusive or
 * was confused by this so long :(
 */
public class Solution {
    public int maxProduct(String[] words) {
        int res[] = new int[words.length];
        
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length(); j++){
                res[i] |= 1 << (words[i].charAt(j) - 'a');
            }
        }
        
        int max = 0;
        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                if((res[i] & res[j]) == 0)
                    max = Math.max(max, words[i].length() * words[j].length());
            }
        }
        return max;
    }
}
