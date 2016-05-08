/**
 * Use hashset to determine if duplicate
 * and move the left pointer to the last occurrence of duplicates
 * This loops through the string at most twice.
 * An one loop solution will be using hashtable to store the index of last occurrence
 * therefore saving the second looping when duplicates founds
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0)
            return 0;
        int max = 0;
        Set hset = new HashSet<Character>();
        int left = 0;
        int right = 0;
        while(right < s.length()){
            if(hset.add(s.charAt(right))){
                right++;
                max = Math.max(max, hset.size());
            }else{
                hset.remove(s.charAt(left++));
            }
        }
        
        return max;
    }
}
