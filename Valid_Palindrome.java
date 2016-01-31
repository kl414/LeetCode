public class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.isEmpty()) return true;
        
        int head = 0;
        int tail = s.length() - 1;
        while(head <= tail){
            char h = s.charAt(head);
            char t = s.charAt(tail);
            
            if(!Character.isLetterOrDigit(h)){
                head++;
            }else if(!Character.isLetterOrDigit(t)){
                tail--;
            }else if(Character.toLowerCase(h) != Character.toLowerCase(t)){
                return false;
            }else{
                head++;
                tail--;
            }
        }
        
        return true;
    }
}
