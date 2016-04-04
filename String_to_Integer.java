/**
 * So for the least it should check for isDigit
 * which mean decimal points are not allowed as well since it should be integer
 * overflow maybe?
 * after spoilers: ignore whitespaces at front, signs, empty or all whitespace
 */
public class Solution {
    public int myAtoi(String str) {
        //empty
        if(str == null || str.length() == 0) return 0;
        
        int i = 0;
        //remove leading space, can use trim as well but that will remove tailing spaces too
        while(str.charAt(i) == ' ' && i < str.length())
            i++;
            
        //signs
        int sign = 1;
        if(str.charAt(i) == '+'){
            sign = 1;
            i++;
        }else if(str.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        
        int total = 0;
        while(i < str.length()){
            int digit = str.charAt(i) - '0';
            if(digit < 0 || digit > 9) break;
            
            //check overflow
            if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                
            total = total * 10 + digit;
            i++;
        }
        
        return total * sign;
        
        
    }
}
