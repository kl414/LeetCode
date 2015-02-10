/**
* count the number of 0's, 1's, 2's
* then overwrite the array
* I don't know why I wanted to use O(n^3) solution at first=.=
*/
/*
public class Solution {
    public void sortColors(int[] A) {
        int count0 = 0, count1 = 0, count2 = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] == 0)
                count0++;
            else if(A[i] == 1)
                count1++;
            else
                count2++;
        }
        for(int i = 0; i < A.length; i++){
            if(count0 > 0){
                A[i] = 0;
                count0--;
            }else if(count1 > 0){
                A[i] = 1;
                count1--;
            }else{
                A[i] = 2;
                count2--;
            }
        }
    }
}
*/
/**
 * this is the one-pass solution
 */
public class Solution {
    public void sortColors(int[] A) {
        int k = A.length - 1;
        int i  = 0;
        
        int j = i;
        for(; i <= k; i++){
            if(A[i] == 0){
                A[i] = 1;
                A[j++] = 0;
            }else if(A[i] == 2){
                A[i--] = A[k];
                A[k--] = 2;
            }//case==1 is ignore and goes to next element
        }
    }
}
