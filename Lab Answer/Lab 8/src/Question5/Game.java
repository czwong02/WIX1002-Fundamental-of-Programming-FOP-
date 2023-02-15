
package Question5;

import java.util.Random;

public class Game {
    String name;
    Random rmd = new Random();
    int score;

    public Game(String name) {
        this.name = name;
        this.score = 0;
    }
    
    public void roll() {
        int temp = rmd.nextInt(6)+1;
        this.score += temp;
        System.out.println("The dice number is " + temp);
        display();
    }
    
    public void display() {
        System.out.println("Total number of player " + name + " is " + score);
    }
}
