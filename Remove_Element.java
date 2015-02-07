/**
 * switch the element with the last element that is not target
 */
/*
public class Solution {
    public int removeElement(int[] A, int elem) {
        int end = A.length-1;
        for(int i = 0; i <= end; i++){
            if(A[i] == elem){
                if(A[end] != elem){
                    A[i] = A[end];
                    end--;
                }else{
                    i--;
                    end--;
                }
            }
        }
        return end+1;
    }
}
*/

//opmization from the same idea
/*
public class Solution {
    public int removeElement(int[] A, int elem) {
        int n = A.length;
        int i = 0;
        while (i < n) {
            if (A[i] == elem) {
                A[i] = A[n - 1];
                n--;
            }
            else
                i++;
        }
        return n;
    }
}
*/

//not switching, but rather rebuilding the array
//this way keeps the order from original array, and somehow got better performance
public class Solution {
    public int removeElement(int[] A, int elem) {
        int n = A.length;
        int begin=0;
        for(int i=0;i<n;i++) if(A[i]!=elem) A[begin++]=A[i];
        return begin;
    }
}
