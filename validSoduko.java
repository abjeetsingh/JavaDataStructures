class Solution {
    public boolean isValidSudoku(char[][] board) {
     HashSet<String> check = new HashSet<String>();
    for(int i=0;i<9;++i)
        for(int j=0;j<9;++j)
            if(board[i][j] != '.')
                if(!check.add(board[i][j]+"row"+i)||
                   !check.add(board[i][j]+"column"+j)||
                   !check.add(board[i][j]+"subbox"+i/3+j/3))
                    return false;
     return true;  
    }
}