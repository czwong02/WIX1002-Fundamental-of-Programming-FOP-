
package Question5;

public class Tester {
    public static void main(String[] args) {
        Game player1 = new Game("Wong");
        Game player2 = new Game("Tan");
        
        while(player1.score<100&&player2.score<100) {
            player1.roll();
            player2.roll();
        }
        
        if(player1.score>player2.score) {
            System.out.println("Player " + player1.name + " wins");
        } else {
            System.out.println("Player "+ player2.name +" wins");
        }
    }
}
