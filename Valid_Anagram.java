/**
 * Anagram: make a new word by the exact same characters
 * 1.
 * use an array to increment the number for each character in s,
 * and decrement for t, anagram result should be zero
 * 2.
 * sort the character array of string and compare them
 * I think the follow up can be solved by using HashSet after sorting
 */
 /*
public class Solution {
    public boolean isAnagram(String s, String t) {
        //first check if length is equal
        if(s.length() != t.length()) return false;
        
        int[] result = new int[26];
        for(int i = 0; i < s.length(); i++)
            result[s.charAt(i) - 'a']++;
        for(int i = 0; i < t.length(); i++){
            result[t.charAt(i) - 'a']--;
            //save some time for entering third loop
            if(result[t.charAt(i) - 'a'] < 0)
                return false;
        }
        
        for(int num: result){
            if(num != 0)
                return false;
        }
        
        return true;
    }
}
*/

public class Solution {
    public boolean isAnagram(String s, String t) {
        //first check if length is equal
        if(s.length() != t.length()) return false;
        
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        
        return Arrays.equals(sChar, tChar);
    }
}
