public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1 = (C-A) * (D-B);
        int area2 = (G-E) * (H-F);
        int total = area1 + area2;
        
        //check for overlap
        nt left = Math.max(A, E);
        int right = Math.min(G, C);
        int bottom = Math.max(F, B);
        int top = Math.min(D, H);
        if(right > left && top > bottom)
             overlap = (right - left) * (top - bottom);

        //or use below for optimization
        /*
        int left = Math.max(A,E), right = Math.max(Math.min(C,G), left);
        int bottom = Math.max(B,F), top = Math.max(Math.min(D,H), bottom);
        total -= (right - left) * (top - bottom);
        */
        
        return total;
    }
}
