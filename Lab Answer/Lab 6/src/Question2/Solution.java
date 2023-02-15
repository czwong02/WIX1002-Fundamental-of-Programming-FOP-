
package Question2;

public class Solution {
    public static void main(String[] args) {
        int height_triangle = 10;
        for(int i = 0; i<height_triangle; i++) {
            int spaces = height_triangle-1-i;
            multiPrint(spaces, ' ');
            multiPrint(2*i+1, '*');
            System.out.println("");
        }
        int height_diamond = 11;
        int upper = (height_diamond+1)/2;
        for(int i = 0; i<upper; i++) {
            int spaces = upper-1-i;
            multiPrint(spaces, ' ');
            multiPrint(2*i+1, '*');
            System.out.println("");
        }
        
        int lower = height_diamond - upper;
        for(int j = lower-1; j>=0; j--) {
            int spaces = lower-j;
            multiPrint(spaces, ' ');
            multiPrint(2*j+1, '*');
            System.out.println("");
        }
    }
    
    public static void multiPrint(int n, char c) {
        for(int i = 0; i<n; i++) {
            System.out.print(c);
        }
    }
}