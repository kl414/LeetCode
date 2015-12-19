LeetCode OJ
LeetCode Premium Subscription
Problems 
Pick One!
Courses
Discuss
Book
kevinlin414 
231. Power of Two My Submissions Question
Total Accepted: 43790 Total Submissions: 131208 Difficulty: Easy
Given an integer, write a function to determine if it is a power of two.

Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.

Subscribe to see which companies asked this question

Show Tags
Show Similar Problems
Have you met this question in a real interview? Yes  No
Discuss




1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
/**
 * power of two means there is only one bit of n is 1
 * so use n & (n-1) should result in zero if true
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
        
        /* dump way
        while(n > 1){
            if(n % 2 != 0)
                return false;
            n /= 2;
        }
        if(n == 1)
            return true;
        else
            return false;
        */
        
        if(n <= 0) return false;
        return (n & (n-1)) == 0;
    }
}
Custom Testcase  Run Code  Submit Solution
Submission Result: Accepted More Details 

Next challenges: (M) Divide Two Integers (E) Excel Sheet Column Title (M) Super Ugly Number
Share your acceptance!

Frequently Asked Questions | Terms of Service



Copyright © 2015 LeetCode

Send Feedback
