public class sudukoSolver {

  public static void main(String[] args) {
    char[][] board = {
      {'5','3','.','.','7','.','.','.','.'},
      {'6','.','.','1','9','5','.','.','.'},
      {'.','9','8','.','.','.','.','6','.'},
      {'8','.','.','.','6','.','.','.','3'},
      {'4','.','.','8','.','3','.','.','1'},
      {'7','.','.','.','2','.','.','.','6'},
      {'.','6','.','.','.','.','2','8','.'},
      {'.','.','.','4','1','9','.','.','5'},
      {'.','.','.','.','8','.','.','7','9'}
    };

    suduko(board);
    display(board);
  }

  static boolean suduko(char[][] board) {
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board.length; col++) {
        if (board[row][col] == '.') {
          for (char test = '1'; test <= '9'; test++) {
            if (isValid(board, row, col, test)) {
              board[row][col] = test;
              if (suduko(board)) {
                return true;
              }
              board[row][col] = '.'; // backtrack
            }
          }
          return false; // no number fits here
        }
      }
    }
    return true; // solved
  }
  private static boolean isValid(char[][] board, int row, int col, char test) {
    // check row and column
    for (int i = 0; i < board.length; i++) {
      if (board[row][i] == test || board[i][col] == test) {
        return false;
      }
    }
    // check box
    int r = row - row % 3;
    int c = col - col % 3;
    for (int i = r; i < r + 3; i++) {
      for (int j = c; j < c + 3; j++) {
        if (board[i][j] == test) {
          return false;
        }
      }
    }
    return true;
  }
  private static void display(char[][] board) {
    for (char[] row : board) {
      for (char ch : row) {
        System.out.print(ch + " ");
      }
      System.out.println();
    }
  }
}
