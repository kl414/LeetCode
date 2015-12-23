/**
 * Below solution is using regular binary search
 * There is another binary search solution by considering the 2D matrix as an array
 * And do stuff like matrix[mid/col][mid%col]
 * Also there is a slower solution which is O(n) for checking each row
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n = matrix.length - 1, m = matrix[0].length - 1;
        int l = 1, r = n;
        
        while (l <= r){
            int mid = l + (r - l) / 2;
            if (matrix[mid - 1][m] == target) return true;
            if (matrix[mid - 1][m] > target) r = mid - 1; else l = mid + 1;
        }
        int row = r;            
        l = 0;
        r = m;
        while (l <= r){
            int mid = l + (r - l) / 2;
            if (matrix[row][mid] == target) return true;
            if (matrix[row][mid] > target) r = mid - 1; else l = mid + 1;
        }
        return false;
    }
}
