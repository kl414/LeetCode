/**
 * can use containsKey and containsValue methods to determine
 * but there is a simpler solution
 * it works since put() will return the previous value or null if first time
 * also note that the Integer i is used for comparing the value return from put
 */
public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if(words.length != pattern.length()) return false;
        
        HashMap map = new HashMap();
        for(Integer i = 0; i < words.length; i++){
            if(map.put(words[i], i) != map.put(pattern.charAt(i), i))
                return false;
        }
        return true;
    }
}
