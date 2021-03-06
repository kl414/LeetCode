public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>();
        if(rowIndex < 0) return res;
        
        for(int i = 0; i < rowIndex + 1; i++){
            res.add(1);
            for(int j = i - 1; j > 0; j--){
                res.set(j, res.get(j) + res.get(j-1));
            }
        }
        
        return res;
    }
}
