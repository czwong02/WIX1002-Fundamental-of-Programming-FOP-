
package Question6;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        int radius = input.nextInt();
        
        System.out.print("Enter the coordinate in form of x y: ");
        int x = input.nextInt();
        int y = input.nextInt();
        
        if(radius>=x && y<radius) {
            System.out.println("The point is inside the circle");
        } else {
            System.out.println("The point is outside the circle");
        }
    }
}
