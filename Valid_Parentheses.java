/**
 * switch may be a little more efficient, but the idea is same
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        int len = s.length();
        
        if(len == 0) return true;
        if(len % 2 != 0) return false;
        
        if(s.charAt(0) == '(' || s.charAt(0) == '{' || s.charAt(0) == '[')
            st.push(s.charAt(0));
        else
            return false;
            
        int i = 1;
        while(!st.empty()){
            if(i == len) return false;
            
            char c = s.charAt(i++);
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }else{
                char left = st.pop();
                if(left == '(' && c != ')'){
                    return false;
                }
                if(left == '{' && c != '}'){
                    return false;
                }
                if(left == '[' && c != ']'){
                    return false;
                }
            }
        }
        return true;
    }
}
