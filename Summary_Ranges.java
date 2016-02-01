public class Solution {
    public List<String> summaryRanges(int[] nums) {
        //Straight forward
        /* 
        List<String> res = new ArrayList<String>();
        if(nums == null || nums.length == 0) return res;
        int pre = nums[0];
        int len = nums.length;
        
        for(int i = 1; i < len; i++){
            if(nums[i-1] + 1 != nums[i]){
                if(pre == nums[i-1]){
                    res.add(String.valueOf(pre));
                }else{
                    res.add(pre + "->" + nums[i-1]);
                }
                pre = nums[i];
            }else if(i == len - 1){
                res.add(pre + "->" + nums[i]); // case when last range is continuous
            }
        }
        
        if(pre == nums[len-1]) //when last number is not in a range & len == 1
            res.add(String.valueOf(pre)); 
            
        return res;
        */
        
        //simpler solution
        int length = nums.length;

        List<String> result = new ArrayList<String>(length);
    
        for (int i = 0; i < length; i++) {
            int num = nums[i];
    
            while (i < length - 1 && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
    
            if (num != nums[i]) {
                result.add(num + "->" + nums[i]);
            } else {
                result.add(String.valueOf(num));
            }
        }
    
        return result;
    }
}
