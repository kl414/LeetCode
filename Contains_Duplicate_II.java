/**
 * use hashmap to compare the index
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if (result.containsKey(nums[i])) {
                if (i - result.get(nums[i]) <= k) 
                    return true;
            }
            result.put(nums[i], i);
        }
        return false;
    }
}
/**
 * hashSet and use a sliding window of size k
 * more efficient
 */
/*
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
            Set<Integer> set = new HashSet<Integer>();
            for(int i = 0; i < nums.length; i++){
                if(i > k) set.remove(nums[i-k-1]);
                if(!set.add(nums[i])) return true;
            }
            return false;
     }
}
*/
