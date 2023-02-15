
package Question5;

import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        int player1TotalScore = 0;
        int player2TotalScore = 0;
        
        while(player1TotalScore<100 && player2TotalScore<100 ) {
            int player1Score = new Random().nextInt(6)+1;
            int player2Score = new Random().nextInt(6)+1;
            player1TotalScore += player1Score;
            player2TotalScore += player2Score;
            
            System.out.println("\nPlayer 1: " + player1Score);
            System.out.println("Player 2: " + player2Score);
            
            while(player1Score == 6) {
                player1Score = new Random().nextInt(6)+1;
                System.out.println("Player 1 (can play again one more time)");
                player1TotalScore += player1Score;
                System.out.println("Re-Attempt ~ Player 1: " + player1Score);
            }
             while(player2Score == 6) {
                player2Score = new Random().nextInt(6)+1;
                System.out.println("Player 2 (can play again one more time)");
                System.out.println("Re-Attempt ~ Player 2: " + player2Score);
                player2TotalScore += player2Score;
            }

            System.out.println("Player 1 total score: " + player1TotalScore);
            System.out.println("Player 2 total score: " + player2TotalScore);
        }
        if(player1TotalScore>player2TotalScore) {
        System.out.println("\nPlayer 1 wins");
        } else {
        System.out.println("\nPlayer 2 wins");
        }
    }
}
