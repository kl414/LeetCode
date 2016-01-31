/**
 * use the StringBuffer array to store each row's character
 */
public class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();
        StringBuffer[] sb = new StringBuffer[numRows];
        for(int i = 0; i < numRows; i++) sb[i] = new StringBuffer();
        
        for(int i = 0; i < len;){
            for(int j = 0; j < numRows && i < len; j++){
                sb[j].append(s.charAt(i++)); // vertical
            }
            //there are numRows - 2 chars obliquely
            for(int j = numRows - 2; j >= 1 && i < len; j--){
                sb[j].append(s.charAt(i++)); // diagnal
            }
        }
        
        for(int i = 1; i < numRows; i++)
            sb[0].append(sb[i]);
            
        return sb[0].toString();
    }
}
