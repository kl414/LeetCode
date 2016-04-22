public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        recurse(res, new ArrayList<Integer>(), candidates, target, 0);
        return res;
    }
    
    public void recurse(List<List<Integer>> res, List<Integer> list, int[] candidates, int target, int index){
        if(target == 0){
            res.add(list);
            return;
        }
        
        for(; index < candidates.length; index++){
            int newTarget = target - candidates[index];
            if(newTarget >= 0){
                List<Integer> cp = new ArrayList<Integer>(list);
                cp.add(candidates[index]);
                recurse(res, cp, candidates, newTarget, index);
            }else{
                break;
            }
        }
    }
}
