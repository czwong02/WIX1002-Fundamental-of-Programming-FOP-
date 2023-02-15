
package Question3;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter quadratic equation: ");
        String equation = input.nextLine();
        
        int index1 = equation.indexOf("x2");
        int index2 = equation.lastIndexOf("x");
        int a;
        int b;
        int c;
        
        if(index1 == 0) {
            a = 1;
        } else {
            a = Integer.parseInt(equation.substring(0, 1));
        }

        if(Character.isDigit(equation.charAt(index2-1))) {
            b = Integer.parseInt(equation.substring(index2-2, index2));
        } else{
            b = Integer.parseInt(equation.substring(index2-1, index2) + "1");
        } 
        c = Integer.parseInt(equation.substring(equation.length()-2, equation.length()));
        System.out.println(calculation(a, b, c));
    }
    
    public static String calculation(int a, int b, int c) {
        int root = (b*b) - (4 * a * c);

        if(root<0) {
            return "This quadratic equation has 0 root(s)\nNo solution";
        } else if (root==0) {
            double result = ((-b)+Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
            return "This quadratic equation has 1 root(s)\nx = " + result;
        } else {
            double result1 = ((-b)+Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
            double result2 = ((-b)-Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
            return "This quadratic equation has 2 root(s)\nx = " + result1 + "\nx = " + result2;
        }
    }
}
