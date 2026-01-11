
public class nKnight {
  public static void main(String[] args) {
    int n = 4;
    boolean[][] board = new boolean[n][n];
    knight(board, 0);
  }
  static void knight(boolean[][] table, int row) {
    if(row == table.length) {
      display(table);
      System.out.println();
      return;
    }
    for(int col = 0; col < table.length; col++) {
      if(isSafe(table, row, col)) {
        table[row][col] = true;
        knight(table, row + 1);
        table[row][col] = false;
      }
    }
  }
  private static void display(boolean[][] table) {
    for (boolean[] rows : table) {
      for (boolean element : rows) {
        if (!element) {
          System.out.print("X ");
        } else {
          System.out.print("K ");
        }
      }
      System.out.println();
    }
  }
  private static boolean isSafe(boolean[][] table, int row, int col) {
    if (row - 1 >= 0 && col - 2 >= 0) {
        if (!shortfn(table, row, col, -1, -2)) return false;
    }
    if (row - 1 >= 0 && col + 2 < table.length) {
        if (!shortfn(table, row, col, -1, +2)) return false;
    }
    if (row - 2 >= 0 && col - 1 >= 0) {
        if (!shortfn(table, row, col, -2, -1)) return false;
    }
    if (row - 2 >= 0 && col + 1 < table.length) {
        if (!shortfn(table, row, col, -2, +1)) return false;
    }
    return true;
}

  private static boolean shortfn(boolean[][] table,int row,int col,int r,int c){
    int ropr=row+r;
    int oprc=col+c;
    if(table[ropr][oprc]){
      return false;
    }else{
      return true;
    }
  }

}
