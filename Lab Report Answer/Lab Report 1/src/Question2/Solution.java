package Question2;

import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        int color1 = new Random().nextInt(4)+1;
        int number1 = new Random().nextInt(10)+1;
        
        int color2 = new Random().nextInt(4)+1;
        int number2 = new Random().nextInt(10)+1;
        String colorName1 = "";
        String colorName2 = "";
        
        switch(color1) {
            case 1 -> colorName1 = "Red";
            case 2 -> colorName1 = "Blue";
            case 3 -> colorName1 = "Green";
            case 4 -> colorName1 = "Yellow";
        }
        
        switch(color2) {
            case 1 -> colorName2 = "Red";
            case 2 -> colorName2 = "Blue";
            case 3 -> colorName2 = "Green";
            case 4 -> colorName2 = "Yellow";
        }
        
        System.out.println("Card 1 : " + colorName1 + " " + number1);
        System.out.println("Card 2 : " + colorName2 + " " + number2);
        
         if(number1 == 1 && number2 == 10) {
            System.out.println("Card 1 is bigger");
        } else if(number1 == 10 && number2 == 1) {
            System.out.println("Card 2 is bigger");
        } else if(number1==number2) {
            if(color1 < color2) {
                System.out.println("Card 1 is bigger");
            } else {
                System.out.println("Card 2 is bigger");
            } 
        }else  if(number1>number2) {
            System.out.println("Card 1 is bigger");
        } else {
            System.out.println("Card 2 is bigger");
        }
    }
}