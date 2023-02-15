
package Question6;

import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        int randomNum = new Random().nextInt();
        int count = 0;
        System.out.println("The number is: " + randomNum);
        while(randomNum>0){
            count++;
            randomNum/=10;
        }
        System.out.println("The number of digits: " + count);
    }
}
