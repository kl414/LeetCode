/**
 * This question is basically asking what is the sum of peak increments
 * i.e. you buy at lowest and sell at highest during a time period.
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for(int i = 0; i < prices.length-1; i++){
            if(prices[i+1] > prices[i])
                sum += (prices[i+1] - prices[i]);
        }
        return sum;
    }
}
