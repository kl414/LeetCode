public class Solution {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();

        while(n != 0){
            n--; // convert 1 - 26 to 0 - 25 base
            //can also use result.insert(0, (char)('A' + n % 26)); to save the reverse
            result.append((char) ('A' + n % 26)); 
            n /= 26;
        }
        
        return result.reverse().toString();
    }
}
