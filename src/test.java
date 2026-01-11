
public class test {
  public static void main(String[] args) {
      int n=4;
      boolean[][] board=new boolean[n][n];
      queenProblem(board, 0);
  }
  static void queenProblem(boolean[][] board,int row){
    if(row==board.length){
      display(board);
      return;
    }
    for(int col=0;col<board.length;col++){
      if((isSafe(board,row,col))){
        board[row][col]=true;
        queenProblem(board, row+1);
        board[row][col]=false;
      }
    }
  }
  private static void display(boolean[][] board){
    for(boolean[] rows:board){
      for(boolean values:rows){
        System.out.print(values ? "Q":"X");
      }
      System.out.println();
    }
  }
  private static boolean isSafe(boolean[][] board,int row,int col){
    
    for(int i=0;i<col;i++){
      if(board[row][i]) return false;
    }
    for(int j=0;j<row;j++){
      if(board[j][col]) return false;
    }
    //left one 
    int r=row-1,c=col-1;
    while(r>=0 && c>=0){
      if(board[r][c]) return false;
      r--;
      c--;
    }
    //right one
    r=row-1;
    c=col+1;
    while(r>=0&&c<board.length){
      if(board[r][c]) return false;
      r--;
      c++; 
    }
    return true;
  }
}