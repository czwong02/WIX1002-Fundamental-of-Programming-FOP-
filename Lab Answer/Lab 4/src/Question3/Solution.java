
package Question3;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 0;
        int temp = 0;
        while(true) {
            System.out.print("Enter a score [negative score to quit]: ");
            int num = input.nextInt();
            if(num<0) break;
            
            min = Math.min(min, num);
            max = Math.max(max, num);
            count++;
            total += num;
            temp += num*num;
        }
        System.out.println(total);
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        System.out.println("Average Score: " + total/count);
        
        double result = Math.sqrt((temp)-(Math.pow(total, 2)/count)/(count-1));
        System.out.printf("Standard Deviation: %.2f%n", result);
    }
}
