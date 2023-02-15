
package Question3;

import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Random rmd = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of employee N: ");
        int N = in.nextInt();
        
        int[][] hours = new int[N][7];
        int[] totalHours = new int[N];
        
        for(int i = 0; i<hours.length; i++) {
            for(int j = 0; j<hours[i].length; j++) {
                hours[i][j] = rmd.nextInt(8)+1;
                totalHours[i] += hours[i][j];
            }
        }
        
        String[] day = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        
        System.out.print("Employee\t");
        for(String x:day) {
            System.out.print(x+"\t");
        }
        System.out.println("Total hours");
        for(int i = 0; i<hours.length; i++) {
            System.out.print((i+1)+"\t\t");
            for(int j = 0; j<hours[i].length; j++) {
                System.out.print(hours[i][j]+"\t");
            }
            System.out.println(totalHours[i]);
        }
    }
}
