
package Question1;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int num = input.nextInt();
        
        System.out.print("The factors are: 1");
        for(int i = 2; i<num; i++) {
            if(num%i==0) {
                System.out.print(", " + i);
            }
        }
        System.out.println(", " + num);
    }
}
