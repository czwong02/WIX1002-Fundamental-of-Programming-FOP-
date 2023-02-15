
package Question2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        int n = 1;
        int total = 0;
        while(n<=num) {
            for(int i = 0; i<=n; i++) {
                total += i;
            }
            n++;
        }
        System.out.println("Total: " + total);
    }
}
