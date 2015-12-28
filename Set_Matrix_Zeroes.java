/**
 * use first row and first column to store if there exists a zero
 * matrix[0][0] will be used to store info for firstRow
 * So there needs an extra variable to store info for firstCol (col0)
 */
public class Solution {
    public void setZeroes(int[][] matrix) {
        boolean col0 = false;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        for(int i = 0; i < m; i++){
            if(matrix[i][0] == 0) col0 = true;
            for(int j = 1; j < n; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        //bottom-up to maintain the first row and first column values
        for(int i = m - 1; i >= 0; i--){
            for(int j = n - 1; j > 0; j--){
                if(matrix[0][j] == 0 || matrix[i][0] == 0)
                    matrix[i][j] = 0;
            }
            if(col0){
                matrix[i][0] = 0;
            }
        }
        
    }
}
