/**
 * permute n numbers, we can add the nth number into the resulting List<List<Integer>> from the n-1 numbers, in every possible position.
 */
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        result.add(new ArrayList<Integer>());
        
        for(int i = 0; i < nums.length; i++){
            int size = result.size();
            for(int j = 0; j < size; j++){
                
                List<Integer> element = result.get(j);
                for(int k = 0; k < element.size(); k++){
                    List<Integer> temp = new ArrayList<Integer>(element);
                    temp.add(k, nums[i]);
                    result.add(temp);
                }
                //for the add of last spot
                result.get(j).add(nums[i]);
            }
        }
        
        return result;
    }
}
