
package Question4;

class GameTwo extends DiceGame {

    public void startGame() {
        while (true) {
            int p1roll = rollDice();
            System.out.println("Player 1 rolled: " + p1roll);
            if (p1roll == 6) {
                p1roll = rollDice();
                System.out.println("Player 1 rolled: " + p1roll);
                if (p1roll == 6) {
                    System.out.println("Two 6 in a rows, no score");
                    p1roll = 0;
                }
            }
            addPlayer1Score(p1roll);
            System.out.println("Player 1 scores: " + getPlayer1Score());
            System.out.println("");

            if (checkPlayer1Win()) {
                System.out.println("Player 1 wins");
                break;
            }

            int p2roll = rollDice();
            System.out.println("Player 2 rolled: " + p2roll);
            if (p2roll == 6) {
                p2roll = rollDice();
                System.out.println("Player 2 rolled: " + p2roll);
                if (p2roll == 6) {
                    p2roll = 0;
                }
            }
            addPlayer2Score(p2roll);
            System.out.println("Player 2 scores: " + getPlayer2Score());

            if (checkPlayer2Win()) {
                System.out.println("Player 2 wins");
                break;
            }
            System.out.println("");
        }
    }
}
