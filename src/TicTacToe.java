/**
 * TicTacToe
 * UC8 controls the continuous game loop and alternates
 * turns until the game ends.
 */
public class TicTacToe {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    /**
     * Entry point of the program. Demonstrates the structure
     * of a continuous game loop.
     */
    public static void main(String[] args) {
        while (!gameOver) {
            if (isHumanTurn) {
                System.out.println("Human's turn");
            } else {
                System.out.println("Computer's turn");
            }
            // placeholder: gameOver will be set by win/draw check in future UCs
            gameOver = true;
            isHumanTurn = !isHumanTurn;
        }
    }
}
