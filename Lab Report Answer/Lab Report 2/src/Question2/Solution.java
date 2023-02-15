
package Question2;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sample input: ");
        int num = input.nextInt();
        String list = Integer.toBinaryString(num);
        System.out.println(calculate(list));
       }
    
    public static String calculate(String num) {
        String result = "";
        for(int i = 0; i<num.length(); i++) {
            if(num.charAt(i) == '1') {
                int temp =(int) Math.pow(2, num.length()-1-i);
                result += String.valueOf(temp) + " + ";
            }
        }
        return result.substring(0, result.length()-2);
    }
}
