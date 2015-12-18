/**
 * Th basic idea is grid[i][j] is either the sum of dist and min(left, up)
 * Below solution doesn't use extra space but it modifies on the input
 * For extra space solution, regular solution requires O(m * n) space
 * But we can also use O(m) or O(n) space if we keep replacing the array
 * ex. dp[i] = min(dp[i-1], dp[i]) + grid[i][j]
 */
 public class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 && j == 0){
                    //grid[i][j] = grid[i][j];
                }else if(i == 0 && j != 0){
                    grid[i][j] = grid[i][j] + grid[i][j-1];
                }else if(i != 0 && j == 0){
                    grid[i][j] = grid[i][j] + grid[i-1][j];
                }else{
                    grid[i][j] = grid[i][j] + Math.min(grid[i-1][j], grid[i][j-1]);
                }
            }
        }
        
        return grid[m-1][n-1];
    }
}
