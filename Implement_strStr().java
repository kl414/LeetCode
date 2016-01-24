public class Solution {
    public int strStr(String haystack, String needle) {
         if(haystack == null || needle == null) return -1;
         
         for(int i = 0; ; i++){
             for(int j = 0; ; j++){
                 if(j == needle.length()) return i;
                 
                 if(i + j == haystack.length()) return -1;
                 
                 if(haystack.charAt(i+j) != needle.charAt(j)) break;
             }
         }
    }
}

//faster one, but I just don't like the use of substring() and equals()
/*
public int strStr(String haystack, String needle) {
    if(needle.equals("")) return 0;
    int L = needle.length();
    for(int i=0; i<=haystack.length()-L; i++) 
        if(haystack.substring(i,i+L).equals(needle)) return i;
    return -1;
}
*/
