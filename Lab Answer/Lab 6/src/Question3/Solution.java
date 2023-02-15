
package Question3;

import java.util.Arrays;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        int[] list = new int[10];
       System.out.println("The list of number before reversing: ");
        for(int x = 0; x<list.length; x++) {
            list[x] = new Random().nextInt(10000);
            System.out.print(list[x] + " ");
        }
        System.out.println("\nThe list of number after reversing: " );
        reverse(list);
        System.out.println(Arrays.toString(list));
    }
    
    public static int[] reverse(int[] num) {
        for(int i = 0; i<10; i++) {
            int total = 0;
            while(num[i]>0) {
                int temp = num[i]%10;
                total = (total*10+temp);
                num[i]/=10;
            }
            num[i] = total;
        }
        return num;
    }
}
