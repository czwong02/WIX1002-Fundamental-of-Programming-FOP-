
package Question1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String array = input.nextLine();
        array = array.replace("{", "");
        array = array.replace("}", "");
        String[] list = array.split(", ");
        int[] temp = new int[list.length];
        int count = 0;
        for(String x : list) {
            temp[count++] = Integer.parseInt(x);
        }
        double result = 0;
        Arrays.sort(temp);
        if(temp.length%2==0) {
            result = (double) (temp[temp.length/2-1] + temp[temp.length/2])/2;
        } else {
            result = temp[temp.length/2] ;
        }
        System.out.println(result);
    }
}
