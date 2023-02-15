
package Question5;

import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Random rmd = new Random();
        Scanner input = new Scanner(System.in);
        int count = 0;
        while(true) {
            int num1 = rmd.nextInt(13);
            int num2 = rmd.nextInt(13);
            System.out.println("Enter negative number to quit.");
            System.out.print(num1 + " x " + num2 + " = ");
            int ans = input.nextInt();
            if(ans <0) break;
            if(check(num1, num2, ans)) count++;
        }
        System.out.println("Your Score is " + count);
    }
    
    public static boolean check(int x, int y, int z) {
        if(x*y==z) return true;
        return false;
    }
}
