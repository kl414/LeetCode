/*
the number repeats from 1-9
ALWAYS CHECK FOR EDGE CASES
*/
public class Solution {
    public int addDigits(int num) {
        if(num == 0)
            return 0;
        int result = num % 9;
        if(result == 0)
            result = 9;
        return result;
        
        //one line code:
        //return (num - 1) % 9 + 1;
    }
}
