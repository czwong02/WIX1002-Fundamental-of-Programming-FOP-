
package Question1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Solution{

    public static void main(String[] args) {
        System.out.print("Enter the number of students: ");
        int N = new Scanner(System.in).nextInt();
        
        int[] list = new int[N];
        
        int total = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i<N; i++) {
            int temp = new Random().nextInt(101);
            
            list[i] = temp;
            min = Math.min(min, temp);
            max = Math.max(max, temp);
            total += temp;
        }
        
        System.out.println("List of student: " + Arrays.toString(list));
        System.out.println("The highest score: " + max);
        System.out.println("The lowest score: " + min);
        System.out.println("The average score: " + (double)(total/N));
    }
}
