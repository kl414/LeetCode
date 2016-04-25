public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        recurse(res, new ArrayList<Integer>(), k, n, 1);
        return res;
    }
    
    public void recurse(List<List<Integer>> res, List<Integer> list, int k, int n, int i){
        if(n == 0 && list.size() == k){
            res.add(list);
            return;
        }
        while(i < 10 && n > 0){
            int n2 = n - i;
            List<Integer> tmp = new ArrayList<Integer>(list);
            tmp.add(i);
            recurse(res, tmp, k, n2, ++i);
        }
    }
}
