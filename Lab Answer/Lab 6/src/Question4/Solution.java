
package Question4;

public class Solution {
    public static void main(String[] args) {
        System.out.println(gcdIterative(24, 8));
        System.out.println(gcdIterative(200, 625));
    }
    
    public static int gcdIterative(int a, int b) {
        while(true) {
            int remainder = a % b;
            if(remainder==0) {
                return b;
            } else {
                a = b;
                b = remainder;
            }
        }
    }
}
