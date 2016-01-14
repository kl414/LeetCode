public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            //column
            if(!isValid(board, i, 0, i + 1, 9))
                return false;
            //row
            if(!isValid(board, 0, i, 9, i + 1))
                return false;
            
            //cube
            int x = (i % 3) * 3;
            int y = (i / 3) * 3;
            if(!isValid(board, x, y, x + 3, y + 3))
                return false;
            
        }
        
        return true;
    }
    
    public boolean isValid(char[][] board, int x1, int y1, int x2, int y2){
        HashSet set = new HashSet();
        
        for(int i = x1; i < x2; i++){
            for(int j = y1; j < y2; j++){
                if(board[i][j] != '.'){
                    if(!set.add(board[i][j]))
                        return false;
                }
            }
        }
        
        return true;
    }
}
