
package Question5;

import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        int num = new Random().nextInt(10001);
        int sm = num;
        
        int sum = 0;
       while(num>0) {
           int temp = num % 10;
           sum += temp;
           num /= 10;
       }
       
        System.out.println("Sum of digit in " + sm + ": " + sum);
    }
}
