
package Question4;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int second = input.nextInt();
        
        int hours = second/3600;
        int minutes = second/60%60;
        int seconds = second%60;
        
        System.out.println(second + " seconds is " + hours + " hours, " + minutes + " minutes and " + seconds + " seconds");
    }
}
