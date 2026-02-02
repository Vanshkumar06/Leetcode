class Solution {
    List<String>constructBoard(char[][]board){
        List<String> res=new ArrayList<>();
        for(char[] row : board){
            res.add(new String(row));
        }
        return res;
    }


    boolean isValidCell(char[][] board, int row, int col){
        int n = board.length;

        for(int i =0 ;i<n;i++){
            if(board[row][i]=='Q')return false;
        }
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q')return false;
        }
        for(int i =row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q')return false;
        }
        for(int i = row-1,j= col+1;i>=0&&j<n;i--,j++){
            if(board[i][j]=='Q')return false;
        }
        return true;
    }


    void placeQueens(int row,char[][]board, List<List<String>> res){
        if(row == board.length){
            res.add(constructBoard(board));return ;
        }
        for(int col = 0;col<board.length;col++){
            if(isValidCell(board,row,col)){
                board[row][col]='Q';
                placeQueens(row+1,board,res);
                board[row][col] ='.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();

        char[][] board = new char[n][n];

        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                board[i][j] = '.';
            }
        }
         placeQueens(0,board,res);


         return res;
        
    }
}