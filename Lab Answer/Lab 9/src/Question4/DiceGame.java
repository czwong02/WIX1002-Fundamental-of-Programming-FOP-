
package Question4;

import java.util.Random;

class DiceGame {

    private int player1;
    private int player2;

    public DiceGame() {
        player1 = 0;
        player2 = 0;
    }

    public void addPlayer1Score(int n) {
        player1 += n;
    }

    public void addPlayer2Score(int n) {
        player2 += n;
    }

    public int getPlayer1Score() {
        return player1;
    }

    public int getPlayer2Score() {
        return player2;
    }

    public boolean checkPlayer1Win() {
        return player1 >= 100;
    }

    public boolean checkPlayer2Win() {
        return player2 >= 100;
    }

    public int rollDice() {
        Random r = new Random();
        return r.nextInt(6) + 1;
    }
}
