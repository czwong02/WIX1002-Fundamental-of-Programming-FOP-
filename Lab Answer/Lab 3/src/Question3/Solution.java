
package Question3;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sales volume: ");
        int salesVolume = input.nextInt();
        
        if(salesVolume <= 100) {
            System.out.printf("%.2f%n", salesVolume*0.05);
        } else if(salesVolume > 100 && salesVolume <= 500) {
            System.out.printf("%.2f%n", salesVolume*0.075);
        } else if(salesVolume > 500 && salesVolume <= 1000) {
            System.out.printf("%.2f%n", salesVolume*0.1);
        } else {
            System.out.printf("%.2f%n", salesVolume*0.125);
        }
    }
}
