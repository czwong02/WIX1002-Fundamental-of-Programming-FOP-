
package Question2;

import java.util.Arrays;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        int[] list = new int[10];
        int i = 0;
        while(i<10) {
             int temp = new Random().nextInt(21);
             boolean result = true;
            for(int j = 0; j<=i; j++) {
                if(temp == list[j]) result = false;
            }
            if(result) {
                list[i] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(list));
    }
}
