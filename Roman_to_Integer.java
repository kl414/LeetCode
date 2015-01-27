/**
 * If value(curr) > value(pre)
 * then the true value is (result - 2*pre + curr)
 */
//Hashmap way, use extra space and time
//can also use many switch cases to replace the HashMap
/*
public class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int result = 0, pre = 10000, curr = 0;
        
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            curr = map.get(ch);
            if(curr > pre){
                result += curr - 2 * pre;
            }else
                result += curr;
            pre = curr;
        }
        return result;
    }
}
*/

//Another way which only scan the string once
public class Solution {
    public static int romanToInt(String s) {
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            switch (c) {
            //special case IX, IV
            case 'I':
                res += (res >= 5 ? -1 : 1);
                break;
            case 'V':
                res += 5;
                break;
            //special case XL, XC
            case 'X':
                res += 10 * (res >= 50 ? -1 : 1);
                break;
            case 'L':
                res += 50;
                break;
            //special case CD, CM
            case 'C':
                res += 100 * (res >= 500 ? -1 : 1);
                break;
            case 'D':
                res += 500;
                break;
            case 'M':
                res += 1000;
                break;
            }
        }
        return res;
    }
}
