/**
 * If not happy number, then it will have duplicate values
 * using hashset to return false on duplicate since it won't be added
 */
public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> values = new HashSet<Integer>();
        int sum;
        
        while(values.add(n)){
            sum = 0;
            while(n > 0){
                int remain = n % 10;
                sum += remain * remain;
                n /= 10;
            }
            
            if(sum == 1)
                return true;
            else
                n = sum;
        }
        
        return false;
    }
}
