
package Question4;

import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        Random rmd = new Random();
        int player1G1 = rmd.nextInt(7);
        int player2G1 = rmd.nextInt(7);
        
        int player1G2 = rmd.nextInt(7);
        int player2G2 = rmd.nextInt(7);
        
        if((player1G1+player2G1) > (player1G2+player2G2)) {
            System.out.println("Player 1 wins");
        } else {
            System.out.println("Player 2 wins");
        }
    }
}
