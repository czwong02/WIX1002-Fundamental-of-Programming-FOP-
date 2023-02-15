
package Question6;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int num = input.nextInt();
        
        System.out.println("The Pascal Triangle with " + num + " row(s)");
        
        int[][] list = new int[num][num];
        list[0][0] = 1;
        for(int i= 1; i<num; i++) {
            for(int j = 0; j<num; j++) {
                list[i][j] += list[i-1][j];
                if(j>0) list[i][j] +=list[i-1][j-1];
            }
        }
        for(int x[]:list) {
            for(int y:x) {
                System.out.print(y + " ");
            }
            System.out.println("");
        }
    }
}
