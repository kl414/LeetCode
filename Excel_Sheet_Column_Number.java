/**
 * This is like HEX number to decimals
 * Instead of 16 this one will use 26
 * should have checked for error cases
 */

public class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++)
            result = result * 26 + s.charAt(i) - 'A' + 1;
        
        return result;
    }
}
