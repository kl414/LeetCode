/**
 * 1.
 * XOR all of the index and numbers, the result will be the one that is missing
 * The XOR need to start with the length of array to be correct
 * 2.
 * summation of first n natural numbers are n*(n+1)/2
 * But simply use n*(n+1)/2 may have overflow issue
 * 3.
 * Binary search, it's best when array is pre-sorted
 * But the problem will become really easy if it's sorted
 */
 /*
public class Solution {
    public int missingNumber(int[] nums) {
        int result = nums.length;
        for(int i = 0; i < nums.length; i++){
            result ^= nums[i] ^ i;
        }
        return result;
    }
}
*/
/*
public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += i;
            sum -= nums[i];
        }
        sum += nums.length;
        return sum;
    }
}
*/
public class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length, mid= (left + right)/2;
        while(left<right){
            mid = (left + right)/2;
            if(nums[mid]>mid) right = mid;
            else left = mid+1;
        }
        return left;
    }
}
