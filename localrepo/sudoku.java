class Solution{
    public boolean issafe(char[][] board, int row, int col, int num) {
        // Check the row
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == (char)(num + '0')) {
                return false;
            }
        }
        // Check the column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == (char)(num + '0')) {
                return false;
            }
            int sr = (row/3)*3;
            int sc = (col/3)*3;
            for(int i=sr;i<sr+3;i++){
                for(int j=0;j<sc+3;j++){
                    if(board[i][j]==(char)(num+'0')){
                        return false;
                    }
                }
            }
            return true;

        }
        // Check the 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == (char)(num + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean helper(char□□ board , int row, int col){
        if(row == board.length){
            return true;
        }
        int nrow =0;
        int ncol =0;
        if(col!= board.length-1){
            nrow=row;
            ncol=col-+1;
        }else{
            nrow=row+1;
            col=0;

        
        
        }
        if(board[row][col]!='.'){
            if(helper(board,nrow,ncol)){
                return true;
            }
            else{
                for(int i=1;i<=9,i++){
                    if(issafe(board,row,col,i)){
                        board[row][col]=(char)(i+'0');
                        if(helper(board,nrow,ncol)){
                            return true;
                        }else{
                            board[row][col]='.';
                        }
                    }
                }
            }
            return false;
          
        }


    }
   public void solvesoduko(char□□board){
      helper(board,0,0);


   }
}
