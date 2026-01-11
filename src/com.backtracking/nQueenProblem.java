public class nQueenProblem {

    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        System.out.println(queens(board, 0)); // start from row 0
    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false; // backtrack
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        // check vertical column
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // check left diagonal
        for (int i = 1; i <= Math.min(row, col); i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // check right diagonal
        for (int i = 1; i <= Math.min(row, board.length - col - 1); i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean cell : row) {
                System.out.print(cell ? "Q " : "X ");
            }
            System.out.println();
        }
    }
}
