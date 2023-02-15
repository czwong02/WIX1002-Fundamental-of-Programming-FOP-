
package Question1;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        input.nextLine();
        System.out.print("Enter the operand: ");
        String operand = input.nextLine();
        
        switch (operand) {
            case "+" -> System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            case "-" -> System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            case "*" -> System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
             case "/" -> System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
             case "%" -> System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        }
    }
}
