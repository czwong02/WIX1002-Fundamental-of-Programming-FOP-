
package Question2;

public class Solution {
    public static void main(String[] args) {
        double P = 234234;
        double D = 32423;
        double R = 12;
        double Y = 3;
        double M = (P-D) * (1+R*Y/100)/(Y*12);
        
        System.out.printf("Monthly Payment: RM%.2f\n", M);
    }
}
