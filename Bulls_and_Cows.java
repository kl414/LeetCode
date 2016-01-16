public class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;
        int[] m = new int[10];
        int n = secret.length();
        for(int i = 0; i < n; i++){
            if(guess.charAt(i) == secret.charAt(i))
                bull++;
            else{
                m[guess.charAt(i) - '0']--;
                //secret has this digit extra
                if(m[guess.charAt(i) - '0'] >= 0)
                    cow++;
                m[secret.charAt(i) - '0']++;
                //guess has this digit extra
                if(m[secret.charAt(i) - '0'] <= 0)
                    cow++;
            }
        }
        return bull + "A" + cow + "B";
    }
}
