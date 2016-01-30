/**
 * keep counting the same char
 * and then use the count and char to append
 */
public class Solution {
    public String countAndSay(int n) {
        if(n < 1) return "";
        String res = "1";
        for(int i = 1; i < n; i++){
            StringBuilder sb = new StringBuilder();
            
            for(int j = 0; j < res.length(); ){
                int count = 0;
                char say = res.charAt(j);
                while(j < res.length() && say == res.charAt(j)){
                    j++;
                    count++;
                }
                sb.append(String.valueOf(count));
                sb.append(say);
            }
            res = sb.toString();
        }
        
        return res;
    }
}
