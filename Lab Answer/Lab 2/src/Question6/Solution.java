
package Question6;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram: ");
        double M = input.nextDouble();
        
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialTemp = input.nextDouble();
        
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalTemp = input.nextDouble();
        
        double initialTempCelsius = (initialTemp - 32) / 1.8;
        double finalTempCelsius = (finalTemp - 32) / 1.8;
        double Q = M * (finalTempCelsius - initialTempCelsius) * 4184;
        
        System.out.printf("The energy needed is %e%n", Q);
    }
}