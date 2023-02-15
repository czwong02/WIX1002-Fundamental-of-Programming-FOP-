
package Question7;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                double P, i, N, M, C, L, R, c = 0;
        System.out.print("Enter principal amount: ");
        P = input.nextInt();
        
        System.out.print("Enter interest in %: ");
        i = input.nextInt();
        
        System.out.print("Enter total number of month (s): ");
        N = input.nextInt();
        
        System.out.printf("%-12s%-20s%-15s%-15s%-20s%-15s%n", "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");
        
        for(int n = 1; n<=N; n++) {
            M = (P * (i/1200)) / (1 - Math.pow((1 + i / 1200), -N));
            C = M * Math.pow(1 + i / 1200, -(1 + N - n));
            L = M - C;
            R = L / (i/1200) - C;
            c += L;
            
            System.out.printf("%-12d%15.2f%14.2f%14.2f%21.2f%20.2f\n", n, M, C, L, R, c);
        }
    }
}
