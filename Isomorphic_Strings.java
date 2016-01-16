/**
 * HashMap method is what I came up with
 * and then I found a better one from discussion
 */
/*
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)){
                if(map.get(a) != b)
                    return false;
            }else{
                if(map.containsValue(b))
                    return false;
                else
                    map.put(a, b);
            }
        }
        return true;
    }
}
*/

//better solution
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        
        for(int i = 0; i < s.length(); i++){
            if(m1[s.charAt(i)] != m2[t.charAt(i)])
                return false;
            //use i + 1 to avoid 0 since they are init to zero
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
