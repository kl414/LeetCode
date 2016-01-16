/**
 * without using loops can be 
 * 1. define all the numbers of powerOfThree
 * 2. use the maxPowerOfThree in int to determine
 * 3. return n==0 ? false : n==Math.pow(3, Math.round(Math.log(n) / Math.log(3)));
 */
public class Solution {
    public boolean isPowerOfThree(int n) {
       if(n > 1){
           while( n % 3 == 0){
               n /= 3;
           }
       }
       return n == 1;
    }
}
