/**
 * gtg, so just copy the solutions for now
 * below is in-place, non-bit one
 */
/*
public class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int countLive = 0;
                for (int p = Math.max(i-1,0); p < Math.min(i+2,m); p++) {
                    for (int q = Math.max(j-1,0); q < Math.min(j+2,n); q++) {
                        if (board[p][q]==2||board[p][q]==1) countLive++;//count status 0 is live
                    }
                }
                countLive -= board[i][j];
                if (board[i][j] == 0 && countLive == 3) board[i][j] = 3; //status 0 is dead,next status is live
                if (board[i][j] == 1 && (countLive < 2 || countLive > 3)) board[i][j] = 2; //status 0 is live,next status is dead

            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] %= 2;
            }
        }
    }
}
*/
/**
 * in-place, using bit
 */
public class Solution {
 public void gameOfLife(int[][] board) {
    if(board == null || board.length == 0) return;
    int m = board.length, n = board[0].length;

    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            int lives = liveNeighbors(board, m, n, i, j);

            // In the beginning, every 2nd bit is 0;
            // So we only need to care about when 2nd bit will become 1.
            if((board[i][j] & 1) == 1 && (lives >= 2 && lives <= 3)) {
                board[i][j] = 3; // Make the 2nd bit 1: 01 ---> 11
            }
            if((board[i][j] & 1) == 0 && lives == 3) {
                board[i][j] = 2; // Make the 2nd bit 1: 00 ---> 10
            }
        }
    }

    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            board[i][j] >>= 1;  // Get the 2nd state.
        }
    }
}

public int liveNeighbors(int[][] board, int m, int n, int i, int j) {
    int lives = 0;
    for(int p = Math.max(i - 1, 0); p <= Math.min(i + 1, m - 1); p++) {
        for(int q = Math.max(j - 1, 0); q <= Math.min(j + 1, n - 1); q++) {
            lives += board[p][q] & 1;
        }
    }
    lives -= board[i][j] & 1;
    return lives;
}
}
