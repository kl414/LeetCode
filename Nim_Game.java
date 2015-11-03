//if multiple of 4, then false
public class Solution {
    public boolean canWinNim(int n) {
        //natual way of thinking
        //return n % 4 != 0;
        
        //if any of the last two bit are set, then it cannot be multiple of 4
        //bit operation
        if((n & 1) == 1 || (n & 2) == 2) 
            return true;
        else
            return false;
    }
}
