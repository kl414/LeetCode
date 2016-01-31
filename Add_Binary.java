public class Solution {
    public String addBinary(String a, String b) {
        if(a == null || a.isEmpty()) 
            return b;
        if(b == null || b.isEmpty()) 
            return a;


        int n = a.length() - 1;
        int m = b.length() - 1;
        StringBuilder res = new StringBuilder();
        int carry = 0;
        while(n >= 0 || m >= 0){
            int sum = carry;
            if(n >= 0) sum += a.charAt(n--) - '0';
            if(m >= 0) sum += b.charAt(m--) - '0';
            res.append(sum % 2);
            carry = sum / 2;
        }
        if(carry != 0) res.append("1");
        return res.reverse().toString();
    }
}
