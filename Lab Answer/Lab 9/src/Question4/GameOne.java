
package Question4;

class GameOne extends DiceGame {

    public void startGame() {
        while (true) {
            int p1roll = rollDice();
            System.out.println("Player 1 rolled: " + p1roll);
            addPlayer1Score(p1roll);
            while (p1roll == 6) {
                p1roll = rollDice();
                System.out.println("Player 1 rolled: " + p1roll);
                addPlayer1Score(p1roll);
            }
            System.out.println("Player 1 scores: " + getPlayer1Score());
            if (checkPlayer1Win()) {
                System.out.println("Player 1 wins");
                break;
            }
            System.out.println("");

            int p2roll = rollDice();
            System.out.println("Player 2 rolled: " + p2roll);
            addPlayer2Score(p2roll);
            while (p2roll == 6) {
                p2roll = rollDice();
                System.out.println("Player 2 rolled: " + p2roll);
                addPlayer2Score(p2roll);
            }
            System.out.println("Player 2 scores: " + getPlayer2Score());

            if (checkPlayer2Win()) {
                System.out.println("Player 2 wins");
                break;
            }
            System.out.println("");
        }
    }
}