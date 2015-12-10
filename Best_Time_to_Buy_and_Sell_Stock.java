/*
public class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length == 0)
            return 0;
            
        int max = 0;
        int lowest = prices[0];
        for(int price: prices){
            if(price > lowest){
                max = Math.max(max, price - lowest);
            }else{
                lowest = price;
            }
        }
        
        return max;
    }
}
*/
/**
 * Below solution is more like finding max subarray
 * This is slower but just to show a alternative
 */
 public class Solution {
    public int maxProfit(int[] prices) {
        int maxCur = 0;
        int maxSoFar = 0;
        for(int i = 1; i < prices.length; i++){
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxSoFar, maxCur);
        }
        return maxSoFar;
    }
}
