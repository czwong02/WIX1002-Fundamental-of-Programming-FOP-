
package Question5;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for a: ");
        int a = input.nextInt();
        System.out.print("Enter a value for b: ");
        int b = input.nextInt();
        System.out.print("Enter a value for c: ");
        int c = input.nextInt();
        System.out.print("Enter a value for d: ");
        int d = input.nextInt();
        System.out.print("Enter a value for e: ");
        int e = input.nextInt();
        System.out.print("Enter a value for f: ");
        int f = input.nextInt();
        
        if(a*d-b*c == 0) {
            System.out.println("The equation has no solution");
        } else {
        System.out.println("x = " + (double) (e*d-b*f)/(a*d-b*c));
        System.out.println("y = " + (double) (a*f-e*c)/(a*d-b*c));        
        }
    }
}
