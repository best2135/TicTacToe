public class TicTacToe {

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    public static void main(String[] args) {
        placeMove(1, 1, 'X');
        System.out.println(board[1][1]);
    }

    /**
     * Places the given symbol on the board at [row][col] if the move is valid.
     * Input: Row, Column, Symbol ('X' or 'O')
     * Output: true if placed successfully, false if invalid move.
     */
    static boolean placeMove(int row, int col, char symbol) {
        if (!isValidMove(row, col)) {
            return false;
        }
        board[row][col] = symbol;
        return true;
    }

    /**
     * Checks if the given row and column are within bounds
     * and if the target cell is empty.
     * Input: Row, Column
     * Output: true if valid, false otherwise.
     */
    static boolean isValidMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        if (board[row][col] != '-') {
            return false;
        }
        return true;
    }
}