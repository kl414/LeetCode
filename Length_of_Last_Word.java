/**
 * Use trim and lastIndexOf methods make the problem trivial 
 * but defeats the purposes of practicing
 * my idea is find the first non-space index from the end
 * and starting from that index, going backward to find the first space index or until it reaches -1
 * therefore the difference will be the length of last word
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length()-1;
        
        for(; i >= 0 && s.charAt(i)==' '; i--);
        
        //edge case of "" and " "
        if(i == -1) return 0;
        
        int j = i - 1;
        
        for(; j >= 0 && s.charAt(j)!=' '; j--);
        
        return i - j;
    }
    
    //this solution may be faster but the difference should be trivial
    /*
    public int lengthOfLastWord(String s) {
    int len=s.length(), lastLength=0;

    while(len > 0 && s.charAt(len-1)==' '){
        len--;
    }

    while(len > 0 && s.charAt(len-1)!=' '){
        lastLength++;
        len--;
    }

    return lastLength;
    }
    */
}
