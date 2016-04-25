public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
        
        for(int i = index; i < candidates.length; i++){
            //note that it's necessary to init a new variable i for the checking
            if(i > index && candidates[i] == candidates[i-1])
                continue;
            if(target >= candidates[i]){
                int newTarget = target - candidates[i];
                List<Integer> newList = new ArrayList<Integer>(list);
                newList.add(candidates[i]);
                recurse(res, newList, candidates, newTarget, i + 1);
            }else{
                break;
            }
        }
    }
}
