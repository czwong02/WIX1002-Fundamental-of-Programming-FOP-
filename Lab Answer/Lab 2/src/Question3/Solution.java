
package Question3;

import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        Random rmd = new Random();
        int num1 = rmd.nextInt(41)+10;
        int num2 = rmd.nextInt(41)+10;
        int num3 = rmd.nextInt(41)+10;
        
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Number 3: " + num3);
        
        int sum  = num1+num2+num3;
        System.out.println("Sum: " + sum);
        
        double mean = (double)sum/3;
        System.out.printf("Average of three number: %.2f%n", mean);
    }
}
