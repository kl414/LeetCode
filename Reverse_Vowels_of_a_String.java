public class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int i = 0;
        int j = word.length - 1;
        while(i < j) {
            while(i < j && vowels.indexOf(word[i]) == -1) {
                i++;
            }
            while(i < j && vowels.indexOf(word[j]) == -1) {
                j--;
            }
            if(i < j) {
                char temp = word[i];
                word[i] = word[j];
                word[j] = temp;
                i++;
                j--;
            }
        }
        return new String(word);
    }
}
