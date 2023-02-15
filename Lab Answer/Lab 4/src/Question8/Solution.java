
package Question8;

import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        int n = new Random().nextInt(101);
        
        System.out.print("First " + n +" prime number: \n2");
        int count = 1;
            for(int j = 3; j<1000 && count<n; j++) {
                if(isPrime(j)) {
                    System.out.print(", " + j);
                    count++;
                }
        }
            System.out.println("");
    }
    
    public static boolean isPrime(int n) {
        if(n==0 || n==1) return false;
        for(int i = 2; i<n; i++) {
            if(n%i==0) return false;
        }
        return true;
    }
}
